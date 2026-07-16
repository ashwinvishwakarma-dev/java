package streamapi.string;

import java.util.Arrays;
import java.util.List;

public class SecondLongestWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "spring", "java", "kafka", "stream", "api", "spring", "microservices");

        String secondLongest= words.stream()
                .sorted((a,b)->b.length()-a.length())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(secondLongest);
    }
}
