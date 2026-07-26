package leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive128 {
    public static void main(String[] args) {

        int[] num = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(num));
    }

    public static int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        for (int num : set) {
            int current = num;
            if (!set.contains(current - 1)) {
                int currentLength = 1;
                while (set.contains(current + 1)) {
                    currentLength++;
                    current++;
                }
                longest = Math.max(longest, currentLength);
            }
        }
        return longest;
    }
}
