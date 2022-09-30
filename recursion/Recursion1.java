package recursion;

public class Recursion1 {
	public static void print(int[] n, int idx){
	    if(idx == n.length)
	    	return;
		System.out.print(n[idx]);
		print(n, idx+1);
	}
	//---------------------------
	private static boolean isSorted(int[] num, int i) {
		if(i == num.length - 1)// base case
			return true;
		if(num[i] > num[i+1])
			return false;
		boolean bool = isSorted(num, i+1);
		return bool;
	}

	public static void main(String[] args) {
	    int num[] = {3,5,7,9,2};
	    print(num,0);
	    boolean bool = isSorted(num, 0);
	    System.out.println(bool);
	}

}
