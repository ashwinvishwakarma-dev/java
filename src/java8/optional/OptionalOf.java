package java8.optional;

import java.util.Optional;

/**
 * Option.of(), Use when you are 100% sure the value is not null.
 */

public class OptionalOf {
    public static void main(String[] args) {

        String str = "Ashwin";
        Optional<String> name = Optional.of(str);

        if (name.isPresent()){
            System.out.println(name);
        }
    }
}
