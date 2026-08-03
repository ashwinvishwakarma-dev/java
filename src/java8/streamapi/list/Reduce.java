package java8.streamapi.list;

import java.util.Arrays;
import java.util.List;

public class Reduce {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<String> listString = Arrays.asList("India", "is", "my", "Country");
		int sum = list.stream()
				.reduce(0, (a, b) -> a + b);
		
		int multiply = list.stream()
				.reduce(1, (a, b) -> a * b);
		
		String stringJoin = listString.stream()
				.reduce("", (a, b) -> a + " " + b);
		
		
		System.out.println(sum);
		System.out.println(multiply);
		System.out.println(stringJoin);
		
	}
}
