package recursion;

public class GeometricSum {
	
	public static double findGeometricSum(int k){
		// Write your code here
		if(k == 0)
            return 1;
        double sum = findGeometricSum(k-1);
        sum += 1/(Math.pow(2,k));
        return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(findGeometricSum(3));
	}
}
