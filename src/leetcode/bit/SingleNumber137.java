package leetcode.bit;

public class SingleNumber137 {
	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 1, 0, 1, 99};
		System.out.println(singleNumber(nums));
	}
	
	public static int singleNumber(int[] nums) {
		int ans = 0;
		
		for (int bit = 0; bit < 32; bit++) {
			int count = 0;
			
			for (int num : nums) {
				int ones = num & (1 << bit);
				if (ones != 0) {
					count++;
				}
			}
			
			if (count % 3 != 0) {
				ans = ans | (1 << bit);
			}
		}
		return ans;
	}
}
