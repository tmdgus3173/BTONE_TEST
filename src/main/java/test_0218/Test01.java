package test_0218;

class Car {
	int a = 1;
	int b = 2;
	
	public void accelerate(int a, int b) {
		System.out.println("a " + a + " b " + b);
		this.a = a;
		this.b = b;
	}
}

public class Test01 {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.accelerate(10, 15);

	}

}
