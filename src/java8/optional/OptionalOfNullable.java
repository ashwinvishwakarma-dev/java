package java8.optional;

import java.util.Optional;

/**
 * Option.ofNullable(), Use when the value might be null.
 */

public class OptionalOfNullable {
    public static void main(String[] args) {

        String str = "Ashwin";
        Optional<String> name = Optional.ofNullable(str);
        System.out.println(name);
    }
}
