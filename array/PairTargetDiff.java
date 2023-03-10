package array;
import java.util.*;
import java.io.*;
//Link- > https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/searching-and-sorting/find_pair_with_given_difference/ojquestion
public class PairTargetDiff {

    public static void findPair(int[]arr,int target) {
        //write your code here
       Arrays.sort(arr);
       int i=0;
       int j=1;
       while(i<arr.length && j<arr.length){
           if(Math.abs(arr[i]-arr[j]) == target){
               System.out.print(arr[i]+" "+ arr[j]);
               return;
           }
           else if(Math.abs(arr[i]-arr[j]) < target){
               j++;
           }
           else{
               i++;
           }
       }
       System.out.print("-1");
    }

    public static void main(String[]args) {

        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];

        for(int i=0; i < n;i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        findPair(arr,target);
    }
}