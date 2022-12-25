package array;

import java.util.*;
import java.io.*;

//video link-> https://www.youtube.com/watch?v=1otAwCQG7XM&t=587s
// nlogk- time complexity
class Pair implements Comparable<Pair>{
	int num;
	int gap;
	public Pair() {
		// TODO Auto-generated constructor stub
	}
	public Pair(int num, int gap) {
		this.num = num;
		this.gap = gap;
	}
	@Override
	public int compareTo(Pair o) {
		if(this.gap == o.gap)
			return this.num-o.num;
		else
			return this.gap-o.gap;
	}
	@Override
	public String toString() {
		return "Pair [num=" + num + ", gap=" + gap + "]";
	}
	
}

public class KclosestUsingPQ {

    /*find 'k' closest element to 'x' and return answer list*/
    /*elements in answer list should be in ascending order*/
    public static ArrayList<Integer> findClosest(int[]arr,int k,int x) {
        //write your code here
    	ArrayList<Integer> list = new ArrayList<>();
    	PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
    	for(int i=0; i<arr.length; i++) {
    		if(i<k) {
    			pq.add(new Pair(arr[i], Math.abs(arr[i]-x)));
    		}
    		else {
    			pq.remove();
    			pq.add(new Pair(arr[i], Math.abs(arr[i]-x)));
    		}
    	}
//    	System.out.println(pq);
    	while(!pq.isEmpty()) {
    		Pair p = pq.poll();
    		list.add(p.num);
    	}
    	Collections.sort(list);
        return list;
    }

    public static void main(String[]args) {

        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];

        for(int i=0; i < n;i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();
        int x = scn.nextInt();

        ArrayList<Integer>ans = findClosest(arr,k,x);

        for(int val : ans) {
            System.out.print(val + " ");
        }

    }
}