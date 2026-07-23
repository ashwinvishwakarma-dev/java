package java8.streamapi.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWord {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "spring", "java", "kafka", "stream", "api", "spring", "microservices");

        Set<String> set = new HashSet<>();

        List<String> duplicateWord = words.stream()
                .filter(word -> set.add(word) == false)
                .collect(Collectors.toList());

        List<String> duplicate = words.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println(duplicate);

    }
}
