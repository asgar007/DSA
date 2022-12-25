import java.util.ArrayList;
import java.util.List;

public class Random {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String s= "abc";
		permutation(s, 0, s.length() - 1, list);
		System.out.println();
		System.out.println(list);
	}
	
	public static void permutation(String s, int l, int r, List<String> list) {
		if(l == r) {
			System.out.print(s + " ");
			list.add(s);
			return;
		}
		for(int i=l; i<=r; i++) {
			s = swap(s, l, i);
			permutation(s, l+1, r, list);
			s = swap(s, l, i);
		}
	}

	private static String swap(String s, int l, int r) {
		char[] sArray = s.toCharArray();
		char temp = sArray[l];
		sArray[l] = sArray[r];
		sArray[r] = temp;
		return String.copyValueOf(sArray);
	}
}