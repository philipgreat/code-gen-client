package skynetsplitter;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipTest {

	public static void main(String[] args) throws IOException {
		compress("/Users/Philip/githome/bank-biz-suite/bizui/src", "/Users/Philip/Desktop/src.zip");

	}

	public static void compress(String srcFilePath, String destFilePath) throws IOException {
		//
		File src = new File(srcFilePath);

		if (!src.exists()) {
			throw new RuntimeException(srcFilePath + "不存在");
		}
		File zipFile = new File(destFilePath);

		FileOutputStream fos = new FileOutputStream(zipFile);
		ZipOutputStream zos = new ZipOutputStream(fos);
		String baseDir = "";
		compressbyType(src, zos, baseDir);
		zos.close();

	}

	private static void compressbyType(File src, ZipOutputStream zos, String baseDir) throws IOException {

		if (!src.exists())
			return;
		System.out.println("压缩路径 " + baseDir + src.getName());
		// 判断文件是否是文件，如果是文件调用compressFile方法,如果是路径，则调用compressDir方法；
		if (src.isFile()) {
			// src是文件，调用此方法
			compressFile(src, zos, baseDir);

		} else if (src.isDirectory()) {
			// src是文件夹，调用此方法
			compressDir(src, zos, baseDir);

		}

	}

	/**
	 * 压缩文件
	 * 
	 * @throws IOException
	 */
	private static void compressFile(File file, ZipOutputStream zos, String baseDir) throws IOException {
		if (!file.exists())
			return;

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		ZipEntry entry = new ZipEntry(baseDir + file.getName());
		zos.putNextEntry(entry);
		int count;
		byte[] buf = new byte[1024];
		while ((count = bis.read(buf)) != -1) {
			zos.write(buf, 0, count);
		}
		bis.close();

	}

	/**
	 * 压缩文件夹
	 * @throws IOException 
	 */
	private static void compressDir(File dir, ZipOutputStream zos, String baseDir) throws IOException {
		if (!dir.exists())
			return;
		File[] files = dir.listFiles();
		if (files.length == 0) {
			try {
				zos.putNextEntry(new ZipEntry(baseDir + dir.getName() + File.separator));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		for (File file : files) {
			compressbyType(file, zos, baseDir + dir.getName() + File.separator);
		}
	}
}
