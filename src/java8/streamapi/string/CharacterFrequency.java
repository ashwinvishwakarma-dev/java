package java8.streamapi.string;

import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {

        String string = "Programming";

        HashMap<Character, Long> map = (HashMap<Character, Long>) string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(map);

    }
}
