package leetcode.math;

public class SquareRoot {
	public static void main(String[] args) {
		System.out.println(mySqrt(2147483647));
	}
	
	public static int mySqrt(int x) {
		
		if (x == 0 || x == 1) {
			return x;
		}
		
		int left = 1;
		int right = x;
		int ans = 0;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			long square = (long) mid * mid;
			if (square == x) {
				return mid;
			} else if (square > x) {
				right = mid - 1;
			} else {
				ans = mid;
				left = mid + 1;
			}
		}
		return ans;
	}
}
