package java8.streamapi.string;

import java.util.Arrays;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "spring", "java", "kafka", "stream", "api", "spring", "microservices");

        String longestWord = words.stream()
                .max((a, b) -> a.length() - b.length())
                .get();

        System.out.println(longestWord);

    }
}
