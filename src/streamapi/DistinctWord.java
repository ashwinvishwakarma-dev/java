package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DistinctWord {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Java Stream API provides a fluent interface for processing sequences of elements.",
                "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
                "In this exercise, you need to count the total number of words in all sentences.");

        long distinctWord = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s")))
                .distinct()
                .count();

        System.out.println(distinctWord);
    }
}
