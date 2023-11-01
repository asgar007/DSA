package HiveProArraySolution1;
import java.util.concurrent.RecursiveTask;
/*
 RecursiveTask is a part of Java's Fork/Join framework,
 which provides a way to perform tasks concurrently using multiple threads.
 */
class SumTask extends RecursiveTask<Long> {
    private static final int THRESHOLD = 1000; // Adjust the threshold based on the array size
    private int[] array;
    private int startIndex; // represent the start index
    private int endIndex;

    public SumTask(int[] array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    protected Long compute() {
    	//Sequential Summation - base case
        if (endIndex - startIndex <= THRESHOLD) {
            long sum = 0;
            for (int i = startIndex; i < endIndex; i++) {
                sum += array[i];
            }
            return sum;
        //Parallel Processing- recursive
        } else {
            int mid = (startIndex + endIndex) / 2;
            SumTask leftTask = new SumTask(array, startIndex, mid);
            SumTask rightTask = new SumTask(array, mid, endIndex);

            leftTask.fork(); // this means it will be executed asynchronously in a separate thread.
            long rightResult = rightTask.compute(); // this means computed synchronously by the current thread.
            long leftResult = leftTask.join(); // waits for its completion and retrieves its result

            return leftResult + rightResult; // return the both result
        }
    }
}