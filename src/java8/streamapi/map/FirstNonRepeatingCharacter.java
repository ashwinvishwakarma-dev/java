package java8.streamapi.map;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String string = "swiss";

        Character s=string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet()
                .stream()
                .filter(entry->entry.getValue()==1)
                .map(entry->entry.getKey())
                .findFirst()
                .orElse(null);

        System.out.println(s);

    }
}
