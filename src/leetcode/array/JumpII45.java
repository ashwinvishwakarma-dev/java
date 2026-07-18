package leetcode.array;

public class JumpII45 {
    public static void main(String[] args) {

        System.out.println(jump(new int[]{0, 3, 2, 2, 4}));

    }

    public static int jump(int[] nums) {

        int current = 0;
        int jumps = 0;
        int longest = 0;

        for (int i = 0; i < nums.length-1; i++) {

            longest = Math.max(longest, i + nums[i]);

            if (i == current) {
                jumps++;
                current = longest;
            }
        }

        return jumps;
    }
}



