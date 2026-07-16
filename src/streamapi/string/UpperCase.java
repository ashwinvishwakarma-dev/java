package streamapi.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "spring", "java", "kafka", "stream", "api", "spring", "microservices");

        List<String> uppercase = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercase);

    }
}
