package HivePro.arraySolution2;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.List;
import java.util.ArrayList;

/*
 * 	THIS SOLUTION IS NOT WORKING PROPERLY
 * 
*/

public class ArraySum {
    private static final int NUM_CORES = 4;

    public static void main(String[] args) {
    	 // Creating an array of 100000000 numbers
    	// i could test with till this length array since my heap memory limitation
        int[] array = new int[100000000];

        // Initializing the array with values from 1 to 100000000
        for (int i = 0; i < 100000000; i++) {
            array[i] = i + 1;
        }
        
        int chunkSize = array.length / NUM_CORES;

        ExecutorService executor = Executors.newFixedThreadPool(NUM_CORES);
        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 0; i < NUM_CORES; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i == NUM_CORES - 1) ? array.length : (i + 1) * chunkSize;
            Future<Integer> future = executor.submit(new ArraySumTask(array, startIndex, endIndex));
            futures.add(future);
        }

        int totalSum = 0;
        for (Future<Integer> future : futures) {
            try {
                totalSum += future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
        System.out.println("Sum of the array elements: " + totalSum);
    }

    static class ArraySumTask implements Callable<Integer> {
        private int[] array;
        private int startIndex;
        private int endIndex;

        public ArraySumTask(int[] array, int startIndex, int endIndex) {
            this.array = array;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public Integer call() {
            int sum = 0;
            for (int i = startIndex; i < endIndex; i++) {
                sum += array[i];
            }
            return sum;
        }
    }
}
