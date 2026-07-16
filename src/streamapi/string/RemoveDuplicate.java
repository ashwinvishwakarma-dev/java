package streamapi.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "spring", "java", "kafka", "stream", "api", "spring", "api");

        List<String> strings = words.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(strings);

    }
}
