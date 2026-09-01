package leetcode.graph;

public class NumberOfIslands200 {
	public static void main(String[] args) {
		
		char[][] grid = {
				{'1', '1', '0', '0', '0'},
				{'1', '1', '0', '0', '0'},
				{'0', '0', '1', '0', '0'},
				{'0', '0', '0', '1', '1'}
		};
		
		// You write this function
		int result = numIslands(grid);
		
		System.out.println("Number of islands: " + result);
	}
	
	// Write your solution here
	public static int numIslands(char[][] grid) {
		int rowLen = grid.length;
		int colLen = grid[0].length;
		int count = 0;
		
		for (int row = 0; row < rowLen; row++) {
			for (int col = 0; col < colLen; col++) {
				if (grid[row][col] == '1') {
					count++;
					dfs(grid, row, col);
				}
			}
		}
		return count;
	}
	
	private static void dfs(char[][] grid, int row, int col) {
		
		if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
			return;
		}
		
		if (grid[row][col] == '0') {
			return;
		}
		
		grid[row][col] = '0';
		
		dfs(grid, row - 1, col);    //up
		dfs(grid, row + 1, col);    //down
		dfs(grid, row, col - 1);    //left
		dfs(grid, row, col + 1);    //right
	}
}
