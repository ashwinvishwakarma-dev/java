package leetcode.array;

import java.util.Arrays;

public class ProductExceptSelf238 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};

        System.out.println(Arrays.toString(productExceptSelf(a)));

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int suffix = 1;
        prefix[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        for (int i = nums.length - 1; i >= 0; i--) {

            prefix[i] = prefix[i] * suffix;
            suffix = suffix * nums[i];
        }

        return prefix;
    }
}
