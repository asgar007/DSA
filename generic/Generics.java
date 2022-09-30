package generic;

public class Generics<T> {
	private T first;
	private T second;
	public Generics(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	public Generics() {
		// TODO Auto-generated constructor stub
	}
	public T getFirst() {
		return first;
	}
	public T getSecond() {
		return second;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public void setSecond(T second) {
		this.second = second;
	}
}
