package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestName {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");

        int nameCount = names.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);

        System.out.println(nameCount); // return 7

        String longestWord = names.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println(longestWord);
    }
}
