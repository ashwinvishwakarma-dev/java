package streamapi.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupWordByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "spring", "java", "kafka", "stream", "api", "spring", "java");

        HashMap<Integer,List<String>> frequency = (HashMap<Integer, List<String>>) words.stream()
                .collect(Collectors.groupingBy(
                        word->word.length()
                ));

        System.out.println(frequency);
    }
}
