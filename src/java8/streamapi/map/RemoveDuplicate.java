package java8.streamapi.map;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 19, 17, 14, 19, 12);
		
		usingStream(list);
		usingSet(list);
		
	}
	
	
	public static void usingStream(List<Integer> list) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i), i);
		}
		
		list = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.map(entry -> entry.getKey())
				.collect(Collectors.toList());
		
		System.out.println(list);
	}
	
	public static void usingSet(List<Integer> list) {
		Set<Integer> seen = new HashSet<>();
		List<Integer> result = new ArrayList<>();
		
		for (int i = list.size() - 1; i >= 0; i--) {
			if (seen.add(list.get(i))) {
				result.add(list.get(i));
			}
		}
		
		Collections.reverse(result);
		
		System.out.println(result);
	}
}
