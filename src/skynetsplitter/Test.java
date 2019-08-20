package skynetsplitter;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
public class Test {
	
	public void testArray() {
		
		String [] source = {"a","b","c"};
		Object []objs = source;
		
		
		
	}
	public static Map<String, Long> countVotes(String[] votes) {
		Map<String, Long> counterMap = new HashMap<>();

		Stream.of(votes).collect(Collectors.groupingBy(k -> k, () -> counterMap, Collectors.counting()));

		return counterMap;

	}

	public static int compare(Map.Entry<String, Long> c1, Map.Entry<String, Long> c2) {

		int value = c1.getValue().compareTo(c2.getValue());
		if(value != 0) {
			return value;
		}
		
		
		
		return c1.getKey().compareTo(c2.getKey());
		
		

	}

	public static Comparator<Map.Entry<String, Long>> comparingByValueThenName() {
		//return (Comparator<Map.Entry<String, Long>>) (c1, c2) -> compare(c1, c2);
		return (Comparator<Map.Entry<String, Long>>) (c1, c2) -> {
			int value = c1.getValue().compareTo(c2.getValue());
			if(value != 0) {
				return value;
			}
			return c1.getKey().compareTo(c2.getKey());
		};
	}

	public static String voteWinner(String[] votes) {

		if(votes==null) {
			return null;
		}
		if(votes.length==1) {
			return votes[0];
		}
		String value = countVotes(votes).entrySet().stream().max(comparingByValueThenName()).get().getKey();
		

		return value;

	}

	private static void log(Object object) {
		System.out.println(object);
		
	}

	public static void main(String[] args) {

		String[] votes = new String[] { "Glenn", "Emily", "Emily", "Glenn" };
		System.out.println(Test.voteWinner(votes));
	}
}