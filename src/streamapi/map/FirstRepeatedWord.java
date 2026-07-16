package streamapi.map;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "spring", "java", "kafka", "stream", "api", "spring", "microservices");

        Set<String> seen = new HashSet<>();

        String firstRepeated = words.stream()
                .filter(word -> !seen.add(word))
                .findFirst()
                .orElse(null);

        System.out.println(firstRepeated);

    }
}
