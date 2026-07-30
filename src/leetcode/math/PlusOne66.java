package leetcode.math;

import java.util.Arrays;

public class PlusOne66 {
	public static void main(String[] args) {
		int[] num = {9,9};
		System.out.println(Arrays.toString(plusOne(num)));
	}
	
	public static int[] plusOne(int[] digits) {
		
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i] = digits[i] + 1;
				return digits;
			}
			digits[i] = 0;
		}
		int[] result = new int[digits.length + 1];
		result[0] = 1;
		
		return result;
	}
}
