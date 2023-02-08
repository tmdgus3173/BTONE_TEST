package hello;

public class IF01 {

	public static void main(String[] args) {
	//if문 분기문이라고 불린다. 현업에선..
	//조건식 (조건식이 트루일때 아래 실행문 동작
	//만약 변수 a,b = 10이라면 크기가 같은 경우 삼항연산자로 표현 "a==b 같다"
		
	

	IF01 if01 = new IF01();
	//변수명은 같게
//	String temp = if01.cal(1, 10);
	//이건 temp 라는 변수에 담은 것이다.
	System.out.println(if01.cal(20, 10));
	//이건 바로 찍은 것이다.
		
	}
	public String cal(int a, int b) {
		
		String massage = "";
		
		System.out.println();
		
		 if(a==b) {
		//조건은 부정문 부터하는게 편하다. 
			 massage="같다";
		 }
		 else if(a>b) {
			 massage="a가 b보다 크다.";
		 }
		 else {
			 massage="b가 a보다 크다.";
		 }
		 return massage;
	}
	
}
