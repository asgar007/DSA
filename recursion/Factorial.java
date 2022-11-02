package recursion;

public class Factorial {
	
	private static int factRecursive(int num) {
		if(num == 0)
			return 1;
		return num * factRecursive(num - 1);
	}
	
	private static void factRecursiveAdvanced(int num, int answer) {
		if(num == 0) {
			System.out.println(answer);
			return;
		}
		answer = answer * num;
		factRecursiveAdvanced(num - 1, answer);
	}
	
	public static void main(String[] args) {
		int num = 9;
		int factorial = factRecursive(num);
		System.out.println(factorial);
		factRecursiveAdvanced(num, 1);
	}

}
