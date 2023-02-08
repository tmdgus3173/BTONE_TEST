package hello;

public class FOR01 {

	public static void main(String[] args) {
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ1번ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		//칸 구분
// 1.		
		
//		System.out.println(2+" * "+1+" = "+(2*1));
//		System.out.println(2+" * "+2+" = "+(2*2));
//		System.out.println(2+" * "+3+" = "+(2*3));
//		System.out.println(2+" * "+4+" = "+(2*4));
//		System.out.println(2+" * "+5+" = "+(2*5));
//		System.out.println(2+" * "+6+" = "+(2*6));
//		
//		System.out.println(2+" * "+a+" = "+(2*a));
//여서 바뀌는 것에 변수를 두고 반복을 만들면되고
		
		
		int dan = 2; //2단으로 시작
//이건 선언을 해도 되고 안해도 된다. 
//그런데 이게 좀 더 보기 좋아보임.
//저 dan에 어떤 숫자가 들어가도 결과가 바로 나오기 때문이다.
		for(int gugu=1; gugu<10; gugu++) {
			System.out.println(dan + " * " + gugu + " = " + dan * gugu);
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ2번ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		//칸 구분
		
		
// 2.		
//		System.out.println(1+2+3+4+5+6+7+8+9+10);
		
		int sum=0;
		//우선 기본값으로 모든 수의 합을 넣은 변수를 지정해주자.
		for(int num=1; num<11; num++) {
			sum +=num;
			
			//누적합을 써야함
		}
		System.out.println(sum);
		//저 안쪽에 하면 계속 반복되기 때문에
		//누적 합이 하나하나 보임
		//밖에 빼줘야 다 돌고난 후 마지막 값만 확인 가능함.
	
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ3번ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		//칸 구분
// 3.
	 //dan = 2; 
	 //위에서 썼던 단수를 재할당 해줍시다.
		
			for(dan=2; dan<10; dan++) {
					System.out.println(">> "+dan+"단 시작");
					//첫번째 dan에서 통과하면 위 문구가 출력되고 아래 for문으로 이동함.
				for(int gugu=2; gugu<10; gugu++ ){
					System.out.println(dan + " * " + gugu + " = " + dan * gugu);
					//그리고 두번째 구구에서 통과되면 위 문구가 반복되고 끝나면 아래 dan 끝이 나오고 첫번째 for문으로 돌아감
					
				}
				System.out.println(">> "+dan+"단 끝");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			}
			System.out.println("구구단 끝");
	
	
	
	}
}
