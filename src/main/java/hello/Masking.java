package hello;

import java.util.Scanner;

public class Masking {

	public static void main(String[] args) {
		//이름을 입력하면 중간 글씨가 ★이 되어 나오게 만들어야되는디
		Scanner scanner=new Scanner(System.in);
		//이름을 입력했을때 바뀌는거로 하면 되고

		
		System.out.print("이름을 입력하세요 -> ");
		String name=scanner.nextLine();
		
		
//		System.out.println("당신의 이름은 "+ "[" + name + "]" + "입니다.");
//		//이게 아주 기본이 되는 것인디, 입력받은게 바뀌게 해야한다라.

//		만약 세글자의 경우 첫번째와 끝을 제외한 그것들을 ★처리해버리면되는거
		
		int lname=name.length();
//		이름의 길이를 측정하여 외자인지 아닌지만 구분하고 외자의 경우 끝에만 ★처리 아닐경우 중간만 ★처리
		System.out.println("이름의 길이는 "+lname);
		
		
		
		
		if(lname!=2) {
			System.out.println("마스킹 테스트 -> " + "중앙별"+name);
		}
		else {
			System.out.println("마스킹 테스트 -> " + "끝별"+name);
		}
		
		
		
		
		
		
		
	}

}
