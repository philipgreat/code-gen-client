package skynet;


import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import static skynet.SaveIfNotExistProcessor.CREATE_IF_NOT_EXIST_FILE_FLAG;

public class SaveAllFileProcessor extends BaseFileProcessor {

    boolean started;

    Set<String> createdPath = new HashSet<>();

    protected String getFileName(String line) {
        if (isBreakLine(line)) {
            if (line.startsWith(SaveFileProcessor.NEW_FILE_FLAG)) {
                return line.substring(SaveFileProcessor.NEW_FILE_FLAG.length());
            }

            if (line.startsWith(CREATE_IF_NOT_EXIST_FILE_FLAG)) {
                return line.substring(CREATE_IF_NOT_EXIST_FILE_FLAG.length());
            }
        }
        return null;

    }

    public void handleLine(String line, ZipOutputStream zos, String prefix) throws Exception {
        if (!isBreakLine(line)) {
            if (!started) {
                return;
            }
            zos.write(line.getBytes());
            zos.write(newLine().getBytes());
            return;
        }

        //ok it is my job, get the buffer ready to write to the file
        ensureEntry(line, zos, prefix);
        started = true;
    }

    private void ensureEntry(String line, ZipOutputStream zos, String prefix) throws IOException {
        String fileName = prefix + "/" + getFileName(line);

        String[] parts = fileName.trim().split("/");
        String current = null;

        for (int i = 0; i < parts.length; i++) {
            if (current != null) {
                current = current + "/" + parts[i];
            } else {
                current = parts[i];
            }

            if (i < parts.length - 1) {
                current += "/";
            }

            if (createdPath.contains(current)) {
                continue;
            }

            if (line.startsWith(CREATE_IF_NOT_EXIST_FILE_FLAG) && !current.endsWith("/")) {
                current = current + "__CREATE_IF_NOT_EXIST_FILE_FLAG";
            }
            zos.putNextEntry(new ZipEntry(current));
            createdPath.add(current);
        }

    }
}
