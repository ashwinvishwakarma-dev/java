package java8.streamapi.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "spring", "java", "kafka", "stream", "api", "spring", "java");

        String input = "java spring java kafka spring java";



        HashMap<String,Long> frequency = (HashMap<String, Long>) words.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        HashMap<String,Long> frequentWord= (HashMap<String, Long>) Arrays.stream(input.split("\\s"))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));


        System.out.println(frequency);
        System.out.println(frequentWord);
    }
}
