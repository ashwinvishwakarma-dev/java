package leetcode.bit;

public class RangeBitwiseAnd201 {
	public static void main(String[] args) {
		System.out.println(rangeBitwiseAnd(2, 3));
	}
	
	public static int rangeBitwiseAnd(int left, int right) {
		int sum = 0;
		
		for (int i = left; i < right; i++) {
			sum = left & (left + 1);
		}
		
		return sum;
	}
	
	public static int rangeBitwiseAndOptimize(int left, int right) {
		int shift = 0;
		
		while (left != right) {
			left = left >> 1;
			right = right >> 1;
			shift++;
		}
		
		return left << shift;
	}
}
