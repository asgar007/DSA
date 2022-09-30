package generic;

public class Methods {
	
	private static<T> void printArray(T arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Integer arr[] = new Integer[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		printArray(arr);
		
		Generics gArr[] = new Generics[5];
		for(int i=0; i<gArr.length; i++) {
			gArr[i] = new Generics();
		}
		printArray(gArr);
		
	}

	
}
