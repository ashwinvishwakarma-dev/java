package streamapi.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestString {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "spring", "java", "kafka", "stream", "api", "spring", "microservices");

        String longestWord = words.stream()
                .max((a, b) -> a.length() - b.length())
                .get();

        System.out.println(longestWord);

    }
}
