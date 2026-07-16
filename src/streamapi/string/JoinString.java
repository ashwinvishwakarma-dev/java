package streamapi.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinString {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "spring", "java", "kafka", "stream", "api", "spring", "microservices");

        String joinString = words.stream()
                .collect(Collectors.joining(","));

        System.out.println(joinString);

    }
}
