package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {
	
	public static void bfTraversal(int[][] adjMatrix) {
//		testcase
//		5 4
//		0 1
//		0 3
//		1 2
//		3 4
		Queue<Integer> pendingQueue = new LinkedList<>();
		boolean[] visited = new boolean[adjMatrix.length];
		pendingQueue.add(0);
		visited[0] = true;
		while(!pendingQueue.isEmpty()) {
			int currentNode = pendingQueue.poll();
			System.out.print(currentNode + " ");
			for(int i=0; i<adjMatrix.length; i++) {
				if(adjMatrix[currentNode][i] == 1 && visited[i] == false) {
					pendingQueue.add(i);
					visited[i] = true;
				}
			}
		}
	}
	
	private static void dfTraversal(int[][] adjMatrix, int currentNode, boolean[] visited) {
		visited[currentNode] = true;
		System.out.print(currentNode+ " ");
		for(int i=0; i< adjMatrix.length; i++) {
			if(adjMatrix[currentNode][i] == 1 && visited[i] == false) {
				dfTraversal(adjMatrix, i, visited);
			}
		}
	}
	
	public static void dfTraversal(int[][] adjMatrix) {
		boolean visited[] = new boolean[adjMatrix.length];
		dfTraversal(adjMatrix, 0, visited);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // no of vertices
		int e = sc.nextInt(); // no of edges
		int adjMatrix[][] = new int[n][n];
		for(int i=0; i<e; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			adjMatrix[v1][v2] = 1;
			adjMatrix[v2][v1] = 1;
		}
//		dfTraversal(adjMatrix);
		bfTraversal(adjMatrix);
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				System.out.print(adjMatrix[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

}
