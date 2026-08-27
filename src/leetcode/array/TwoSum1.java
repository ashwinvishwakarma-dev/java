package leetcode.array;

import java.util.Arrays;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] numbers = {-1, 0};
        int target = -11;
        System.out.println(Arrays.toString(twoSum(numbers, target)));

    }

    public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum > target) {
                right--;
            } else if (target > sum) {
                left++;
            } else {
                return new int[]{left+1, right+1};
            }
        }

        return new int[]{};
    }
}
