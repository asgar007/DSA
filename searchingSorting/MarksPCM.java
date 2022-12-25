package searchingSorting;

import java.util.*;
import java.io.*;

class Students implements Comparable<Students>{
	int phy;
	int chem;
	int math;
	
	public Students() {
	}
	public Students(int phy, int chem, int math) {
		this.phy = phy;
		this.chem = chem;
		this.math = math;
	}
	@Override
	public int compareTo(Students o) {
		if(this.phy != o.phy) {
			return 1;
		}
		else if(this.chem != o.chem)
			return -1;
		else {
			return 1;
		}
	}
}

public class MarksPCM {
	
	

    /*You have to complete the body of customSort function, 
    after sorting final changes should be made in given arrays only. */
    public static void customSort(int[]phy,int[]chem,int[]math) {
        //write your code here
    	int n = phy.length;
    	Students[] arr = new Students[n];
    	for(int i=0; i<n; i++) {
    		arr[i] = new Students(phy[i], chem[i], math[i]);
    	}
    	    	Arrays.sort(arr);
    }

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);

        //input work
        int N = scn.nextInt();

        int[]phy = new int[N];
        int[]chem = new int[N];
        int[]math = new int[N];

        for(int i=0; i < N;i++) {
            phy[i] = scn.nextInt();
        }

        for(int i=0; i < N;i++) {
            chem[i] = scn.nextInt();
        }

        for(int i=0; i < N;i++) {
            math[i] = scn.nextInt();
        }

        customSort(phy,chem,math);

        //output
        for(int i=0; i < N;i++) {
            System.out.println(phy[i] + " " + chem[i] + " " + math[i]);
        }
    }
}
