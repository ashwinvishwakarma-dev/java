package java8.streamapi.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatTwoWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        String concatWord = words.stream()
                .filter(word -> word.length() % 2 == 0)
                .limit(2)
                .collect(Collectors.joining());

        System.out.println(concatWord);

    }
}
