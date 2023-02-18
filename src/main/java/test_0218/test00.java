package test_0218;

public class test00 {

	public int sum(int a, int b) {
		return a+b;
	}
	
	
	
	public static void main(String[] args) {
	
		test00 test001 = new test00();
		
		int a = 1;
		int b = 2;
		
		int c = test001.sum(a, b);
		
		System.out.println(c);

	}

}
