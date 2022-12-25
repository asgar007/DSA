package searchingSorting;

import java.util.*;
import java.io.*;

//youtube link for this-> https://youtu.be/JCT04Z94Nyo?list=TLGGyqR9JHTsH3QyMDEyMjAyMg

public class UnionOfArrays {

    /*You have to complete union function and return an Arraylist which contains union elements of the two arrays*/
    public static ArrayList<Integer> union(int[] a,int[] b) {
        //write your code here
    	int i=0;
    	int j=0;
    	int curr = Integer.MIN_VALUE;
    	ArrayList<Integer> list = new ArrayList<>();
    	while(i<a.length && j<b.length) {
    		if(a[i] == b[j]) {
    			list.add(a[i]);
    			curr = a[i];
    			i++; j++;
    		}
    		else if(a[i]<b[j]){
    			if(curr == a[i]) {
    				i++;
    			}
    			else {
    				list.add(a[i]);
    				curr= a[i];
    				i++;
    			}
    		}
    		else {
    			if(curr == b[j]) {
    				j++;
    			}
    			else {
    				list.add(b[j]);
    				curr=b[j];
    				j++;
    			}
    		}
    	}
    	//handle rest of data in array
    	while(i<a.length) {
    		if(curr == a[i]) {
				i++;
			}
    		else {
    			list.add(a[i]);
    			 curr = a[i];
    			i++;
    		}
    	}
    	//for b
    	while(i<b.length) {
    		if(curr == b[j]) {
				j++;
			}
    		else {
    			list.add(b[j]);
    			 curr = b[j];
    			j++;
    		}
    	}
        
        return list;
    }

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        //input work
        int n = scn.nextInt();
        int[]a = new int[n];
        for(int i=0; i < n;i++) {
            a[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[]b = new int[m];
        for(int i=0;i < m;i++) {
            b[i] = scn.nextInt();
        }

        ArrayList<Integer>ans = union(a,b);

        //print answer list
        for(int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}