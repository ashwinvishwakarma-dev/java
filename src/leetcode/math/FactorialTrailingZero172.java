package leetcode.math;

public class FactorialTrailingZero172 {
	public static void main(String[] args) {
		System.out.println(trailingZeroesOptimized(100));
	}
	
	public static int trailingZeroesOptimized(int n) {
		int count = 0;
		
		while (n > 0) {
			n = n / 5;
			count = count + n;
		}
		return count;
	}
	
	public static int trailingZeroes(int n) {
		int count = 0;
		
		long fact = factorial(n);
		
		while (fact > 0) {
			if (fact < 9) {
				return count;
			} else {
				long rem = fact % 10;
				fact = fact / 10;
				if (rem != 0) {
					return count;
				}
				count++;
			}
		}
		return count;
	}
	
	public static long factorial(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}
