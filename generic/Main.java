package generic;

public class Main {
	public static void main(String[] args) {
		Generics<Integer> n = new Generics<>(12,114);
		System.out.println(n.getFirst()+ " "+ n.getSecond());
		
		Generics<String> str = new Generics<>("asgar","ali");
		System.out.println(str.getFirst()+ " "+ str.getSecond());
	}
}
