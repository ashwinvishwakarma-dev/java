package java8.streamapi.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAlphabet {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "spring", "java", "kafka", "stream", "api", "spring", "microservices");

        List<String> ascendingWord = words.stream()
                .sorted()
                .collect(Collectors.toList());

        List<String> descendingWord = words.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(ascendingWord);
        System.out.println(descendingWord);

    }
}
