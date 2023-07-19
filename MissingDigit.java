public class MissingDigit {
	
    public static void main(String[] args) {
    	System.out.println(missingDigit("3x + 12 = 46"));  // Output: 4
//        System.out.println(missingDigit("4 - 2 = X"));  // Output: 2
//        System.out.println(missingDigit("1x0 = 12 - 1200"));  // Output: 0 
    }

    public static int missingDigit(String str) {
        //iterate over string
    	String[] parts = str.split("=");

    	for(int i=0; i<parts.length; i++) {
//    		char ch = str.charAt(i);
    		System.out.println(parts[i]);
    	}
    	
    	
    	return 0;
    }
}
