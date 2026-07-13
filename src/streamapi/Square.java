package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> square = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
        System.out.println(square);

        int[] nums = {1, 2, 3, 4, 5};

        List<Integer> sqaureInt = Arrays.stream(nums)
                .boxed()
                .map(num -> num * num)
                .collect(Collectors.toList());
        System.out.println(sqaureInt);
    }
}
