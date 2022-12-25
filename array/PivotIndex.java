package array;

import java.util.*;
import java.io.*;

public class PivotIndex {

    private static int sum(int[] arr, int s, int e){
        int temp = 0;
        for(int i=s; i<=e; i++){
            temp+=arr[i];
        }
        return temp;
    }
    public static int pivot_index(int[]arr) {
        //write your code here
        for(int p=1; p<arr.length; p++){
            int rightSum = sum(arr, p+1, arr.length - 1);
            int leftSum = sum(arr, 0, p-1);
            if(rightSum == leftSum){
                return p;
            }
        }
        return -1;
    }

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];

        for(int i=0; i < arr.length;i++) {
            arr[i] = scn.nextInt();
        }

        int pi = pivot_index(arr);
        System.out.println(pi);
    }
}