package leetcode.bit;

public class EvenOdd {
	public static void main(String[] args) {
		System.out.println(isEven(21));
	}
	
	public static boolean isEven(int num) {
		return (num & 1) == 0;
	}
}
