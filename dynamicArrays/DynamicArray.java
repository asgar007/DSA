package dynamicArrays;

public class DynamicArray {
	private int data[];
	private int nextElementIndex;
	public DynamicArray() {
		data = new int[5];
		nextElementIndex = 0;
	}
	
	
	
	public void add(int n) {
		if(nextElementIndex == data.length) {
			doubleCapacity();
		}
		data[nextElementIndex] = n;
		nextElementIndex++;
	}
	public void size() {
		System.out.println(nextElementIndex);
	}
	
	private void doubleCapacity() {
		int [] temp = data;
		data = new int[2*temp.length];
		for(int i=0; i<temp.length; i++) {
			data[i] = temp[i];
		}
	}

	public int get(int i) {
		// TODO Auto-generated method stub
		return data[i];
	}
	
	
	public int set(int i, int j) {
		data[i] = j;
		return data[i];
	}
}
