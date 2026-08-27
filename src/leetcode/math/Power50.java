package leetcode.math;

public class Power50 {
	public static void main(String[] args) {
		double x = 2.00000;
		int n = -2;
		System.out.println(myPow(x, n));
	}
	
	public static double myPow(double x, int n) {
		long power = n;
		double result = 1;
		if (n < 0) {
			x = 1 / x;
			power = -power;
		}
		
		while (power > 0) {
			if (power % 2 == 1) {
				result = result * x;
			}
			power = power / 2;
			x = x * x;
		}
		
		return result;
	}
}
