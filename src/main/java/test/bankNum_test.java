package test;

import java.util.Scanner;

public class bankNum_test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("계좌번호를 입력해주세요 -> ");
		
		String num = scanner.nextLine();
		
		String maskingNum = "";
		//이게 계좌번호의 중간이 될 즉 place를 통해 ★이 될 것입니다.
		
		if(num.length() < 5) {
			maskingNum = num.substring(num.length());
		}
		else if(num.length() > 4 && num.length() < 9) {
			maskingNum = num.substring(4, num.length()-3);
		}
		else {
			maskingNum = num.substring(4, num.length());			
		}

		
		String masking = "";
		//이게 이제 maskingNum가 변하게 될 ★입니다.
		
		for(int i = 0; i<maskingNum.length(); i++) {
			masking += "★";
		}
		
		if(num.length() < 5) {
			num = num.substring(0, num.length()-1) + maskingNum.replace(maskingNum, masking); 
		}
		
		else if(num.length() > 4 && num.length() < 9) {
			num = num.substring(0, 4) + maskingNum.replace(maskingNum, masking) + num.substring(7, num.length());
		}
		
		else {
			num = num.substring(0, 4) + maskingNum.replace(maskingNum, masking) + num.substring(7, num.length());
		}
		
		System.out.println("마스킹 후 계좌번호 -> " + num);
		
	}

}
