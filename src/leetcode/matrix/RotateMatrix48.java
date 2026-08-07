package leetcode.matrix;

import java.util.Arrays;

public class RotateMatrix48 {
	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		rotate(matrix);
	}
	
	public static void rotate(int[][] matrix) {
		int len = matrix[1].length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		for (int i = 0; i < len; i++) {
			int left = 0;
			int right = len - 1;
			
			while (left < right) {
				int temp = matrix[i][left];
				matrix[i][left] = matrix[i][right];
				matrix[i][right] = temp;
				
				left++;
				right--;
			}
		}
		
		System.out.println(Arrays.deepToString(matrix));
	}
}
