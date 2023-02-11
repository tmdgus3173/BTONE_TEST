package test;
public class method_test{
	public int sum(int a, int b) {
		return a+b;
	}

	
	
	public static void main(String[] args) {
		int a = 3; 
		int b = 4;
		
		method_test myTest = new method_test();
		int c = myTest.sum(a, b);
		
		System.out.println(c);
	}
}