package java8.streamapi.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringByLength {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "spring", "java", "kafka", "stream", "api", "spring", "microservices");

        List<String> shortToLong = words.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());

        List<String> longToShort = words.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());

        System.out.println(shortToLong);
        System.out.println(longToShort);

    }
}
