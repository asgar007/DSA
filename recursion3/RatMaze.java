package recursion3;

public class RatMaze {
	
	private static boolean solveRatInAMaze(int[][] maze, int i, int j, int[][] path) {
		// cell must be valid
		int row = maze.length;
		int col = maze[0].length;
		if(i < 0 || i >= row || j < 0 || j >= col || maze[i][j] == 0 || path[i][j] == 1) {
			return false;
		}
		
		path[i][j] = 1;//update path matrix
		
		//if we reach destination
		if(i == row - 1 && j == col -1) {
			return true;
		}
		
		//explore further with recursion
		//going top
		if(solveRatInAMaze(maze, i-1, j, path)) {
			return true;
		}
		//down
		if(solveRatInAMaze(maze, i+1, j, path)) {
			return true;
		}
		//left
		if(solveRatInAMaze(maze, i, j-1, path)) {
			return true;
		}
		//right
		if(solveRatInAMaze(maze, i, j+1, path)) {
			return true;
		}
		return false;
	}
	
	public static boolean ratInAMaze(int maze[][]) {
		int n = maze.length;
		int path[][] = new int[n][n];
		return solveRatInAMaze(maze, 0, 0, path);
	}

	
}
