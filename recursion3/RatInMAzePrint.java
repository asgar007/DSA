package recursion3;

public class RatInMAzePrint {
	private static void printAllPaths(int[][] maze, int i, int j, int[][] path) {
		// cell must be valid
		int row = maze.length;
		int col = maze[0].length;
		if(i < 0 || i >= row || j < 0 || j >= col || maze[i][j] == 0 || path[i][j] == 1) {
			return;
		}
		
		path[i][j] = 1;//update path matrix
		
		//if we reach destination
		if(i == row - 1 && j == col -1) {
			for(int r=0; r<maze.length; r++) {
				for(int c=0; c<maze.length; c++) {
					System.out.print(path[r][c]+" ");
				}
//				System.out.println();
			}
			path[i][j] = 0;
			System.out.println();
			return;
		}
		
		//explore further with recursion
		//going top
		printAllPaths(maze, i-1, j, path);
		//down
		printAllPaths(maze, i+1, j, path);
		//left
		printAllPaths(maze, i, j-1, path);
		//right
		printAllPaths(maze, i, j+1, path);
		path[i][j] = 0;
	}
	
	public static void ratInAMaze(int maze[][]) {
		int n = maze.length;
		int path[][] = new int[n][n];
		 printAllPaths(maze, 0, 0, path);
	}
}
