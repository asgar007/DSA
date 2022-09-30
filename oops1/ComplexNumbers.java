package oops1;

public class ComplexNumbers {
	
	int real;
	int image;
	


	public ComplexNumbers(int real, int image) {
		super();
		this.real = real;
		this.image = image;
	}

	public void plus(ComplexNumbers c2) {
		this.real += c2.real;
		this.image += c2.image;	
	}

	public void print() {
		System.out.println(this.real + " + i"+ image);
	}

	public void multiply(ComplexNumbers c2) {
		int r = this.real;
		int i = this.image;
		this.real = r*c2.real - i*c2.image;
		this.image = r*c2.image + i*c2.real;
	}
	
}
