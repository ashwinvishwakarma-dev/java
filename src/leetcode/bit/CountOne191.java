package leetcode.bit;

public class CountOne191 {
	public static void main(String[] args) {
		System.out.println(hammingWeight(2147483645));
		
	}
	
	public static int hammingWeight(int n) {
		int count = 0;
		
		for (int i = 0; i < 32; i++) {
			int last = n & 1;
			if (last == 1) {
				count++;
			}
			n = n >>> 1;
		}
		
		return count;
	}
	
	public static int hammingWeightOptimized(int n) {
		int count = 0;
		
		while (n != 0) {
			int last = n & 1;
			if (last == 1) {
				count++;
			}
			n = n >>> 1;
		}
		
		return count;
	}
}
