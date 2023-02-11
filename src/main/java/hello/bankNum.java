package hello;

import java.util.Scanner;

public class bankNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String fourStar = "";
		String maskingNum = "";
		
		//이게 계좌번호의 중간이 될 즉 place를 통해 ★이 될 것입니다.
		
		
		System.out.print("계좌번호를 입력해주세요 -> ");
		//계좌번호 입력
		
		String num = scanner.nextLine();
		
		//String lastNum = num.substring(8);
		//번호를 입력받고 아래로 내려가던 중 (8)에서 이미 8자리가 아니게 되기때문에 다음단계인 if까지 가질 못한다.
		//그렇기 때문에 에러가 발생했던 것이다.
		
		if(num.length() < 5) {
			maskingNum = num.substring(num.length()-1);
			//4자 이하 마스킹은 잘 돌아간다.
		}
		else if(4 < num.length()&& num.length() < 9) {
			maskingNum = num.substring(4, num.length());
			//중간의 번위가 4번부터 문자열 끝까지
		}
		else {
			 fourStar = "★★★★";
			//9자리 이상부터는 중간 마스킹 4개가 고정이니까.
			
		}

		String masking = "";
		// maskingNum가 변하게 될 ★입니다.
		
		for(int i = 0; i<maskingNum.length(); i++) {
			masking += "★";
			//마스킹넘버의 길이만큼 ★을 반복 누적해서 넣는다.
		}
		
		if(num.length() < 5) {
			num = num.substring(0, num.length()-1) + maskingNum.replace(maskingNum, masking); 
			//끝에 한자리만 넣는거니 0 ~ 길이 -1 나머지는 다 마스킹
		} else if(4 < num.length()&& num.length() < 9) {
			num = num.substring(0, 4) + maskingNum.replace(maskingNum, masking);
			//0~4까지만 가지고 있고 나머지는 전부 마스킹처리
		} else {
			String lastNum = num.substring(8);
			//끝에 올 문자열을 따로 지정했다.
			num = num.substring(0, 4) + fourStar + lastNum;
			//0~4까지만 가지고가고 고정 마스킹인 ★4개 사이에 넣고 위에서 선언한 마지막 문자열을 붙인다.
		}
		
		System.out.println("마스킹 후 계좌번호 -> " + num);
		
	}

}
