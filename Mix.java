import java.util.Scanner;

public class Mix {
	String wrd;
	int len;
	
	public Mix() {
		wrd = "Rehan";
		len = wrd.length();
	}
	
	void feedword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string in upper case");
		wrd = sc.next();
		len = wrd.length();
	}
	
	void mix_word(Mix P, Mix Q) {
		
	}
	
	void display() {
		System.out.println(wrd);
	}
	
	public static void main(String[] args) {
		Mix P = new Mix();
		Mix Q = new Mix();
		Mix ans = new Mix();
	}
}
