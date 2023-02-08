package test;

import java.util.Scanner;

public class mask_test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 -> ");
		// 이름 설정
		String name = scanner.nextLine();

		// null 또는 빈값 체크
		if(name != null && !"".equals(name)){
		// 이름 가운데 글자 마스킹
		String middleMask = "";
		// 이름이 외자 또는 4자 이상인 경우 분기
		if(name.length() > 2){
		middleMask = name.substring(1, name.length()-1);
		} else {
		middleMask = name.substring(1, name.length());
		}
		
		String masking = "";
		// 가운데 글자 마스킹 하기위한 증감값
		for(int i = 0; i < middleMask.length(); i++){
		masking += "★";
		}

		
		// 이름이 외자 또는 4자 이상
		if(name.length() > 2){
		name = name.substring(0,1)
		+ middleMask.replace(middleMask, masking)
		+ name.substring(name.length()-1, name.length());
		} else {
		name = name.substring(0,1)
		+ middleMask.replace(middleMask, masking);
		}
		}

		System.out.println("이름 마스킹 : " + name);

		
	}

}
