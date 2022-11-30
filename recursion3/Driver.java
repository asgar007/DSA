package recursion3;

public class Driver {
	public static void main(String[] args) {
		int maze[][] = {{1, 1, 1}, {1, 1, 0},{0, 1, 1}};
//		boolean ans = RatMaze.ratInAMaze(maze);
//		System.out.println(ans);
		RatInMAzePrint.ratInAMaze(maze);
	}
}
