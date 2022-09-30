package dynamicArrays;

public class DynamicArrayUse {
	public static void main(String[] args) {
		
		DynamicArray d = new DynamicArray();
		
		for(int i=1; i<50; i++) {
			d.add(100+i);
		}
		System.out.println(d.get(44));
		System.out.println(d.set(0, 55));
		d.size();
	}
}
