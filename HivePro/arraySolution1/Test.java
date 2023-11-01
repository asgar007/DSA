package HivePro.arraySolution1;

import java.util.concurrent.ForkJoinPool;


public class Test {
    public static void main(String[] args) {
    	 // Creating an array of 100000000 numbers
    	// i could test with till this length array since my heap memory limitation
        int[] array = new int[100000000];

        // Initializing the array with values from 1 to 100000000
        for (int i = 0; i < 100000000; i++) {
            array[i] = i + 1;
        }
        // Creating ForkJoinPool with 4 cores
        ForkJoinPool forkJoinPool = new ForkJoinPool(4); 
        long result = forkJoinPool.invoke(new SumTask(array, 0, array.length));//it blocks until the computation is complete and returns the result of the computation.
        System.out.println("Sum: " + result);
    }
}
