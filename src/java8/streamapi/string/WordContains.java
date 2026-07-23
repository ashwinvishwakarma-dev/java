package java8.streamapi.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordContains {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "spring", "java", "kafka", "stream", "api", "spring", "microservices");

        List<String> contains = words.stream()
                .filter(str -> str.toLowerCase().startsWith("s"))
                .collect(Collectors.toList());

        System.out.println(contains);

    }
}
