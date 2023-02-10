package hello;

import java.util.Scanner;

public class MaskingName {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 적으세요 -> ");
		//뽈롱
		
		String name = scanner.nextLine();
		//이름을 적는다.
		
		String maskingName = "";
		//중간 글자 마스킹 
		
		if(name.length() > 2){
		//세글자이상일때
			maskingName = name.substring(1, name.length()-1);
		} 
		else {
		//그리고 세글자 이상이 아닐때니까 외자일때
			maskingName = name.substring(1, name.length());
		}
		
		String masking = "";
		//별 들어갈거 선언해주고
		for(int i = 0; i < maskingName.length(); i++){
		//그 마스킹인 별을 중간 이름의 길이만큼 반복해서 누적시키고
			masking += "★";
		}


		if(name.length() > 2){
		//세글자 이상일때
			name = name.substring(0,1) + maskingName.replace(maskingName, masking) + name.substring(name.length()-1, name.length());
		//이름 = 이름 첫글자 + 중간 이름을 maskingName -> making(★) + 끝이름(최대길이-1 에서 최대길이까지)
		} 
		else {
		//외자일때
			name = name.substring(0,1) + maskingName.replace(maskingName, masking);
		//이름 = 이름 첫글자 + 중간이름 maskingName -> masking(★)로 교체. 두글자다보니 첫글자만 있고 끝은 없다.
		}
		

		System.out.println("마스킹 후 이름 -> " + name);

	}

}
