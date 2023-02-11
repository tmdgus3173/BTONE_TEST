package test;

public class method_test1 {

	public method_test1() {
		System.out.println("생성자 호출 성공");
	}
	public method_test1(int a) {
		System.out.println( a + "생성자 호출 성공");
	}
	

	public static void main(String[] args) {
		method_test1 te = new method_test1(12);
		method_test1 te2 = new method_test1();
		
		
	}

}
