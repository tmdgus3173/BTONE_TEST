package test;

@FunctionalInterface
interface MySum{
	public int sum(int a, int b);
}

public class lambda_test {

	public static void main(String[] args) {
		
		MySum func = (a,b) -> a<b ? b:a;
		//위에 인터페이스로 함수형을 가지고 와서 비교해서 맞으면 b 틀리면 a 출력하게만든다.
		System.out.println(func.sum(5, 6));
		//여기서 샥샥해서 나오게 해준다.
	}

}
