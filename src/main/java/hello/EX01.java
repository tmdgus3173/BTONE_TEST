package hello;

import java.util.Arrays;
import java.util.List;

public class EX01 {
	
	
	public List<String> tempAlphabetList(){
		//나중가면 변수명 만드는것도 스트레스 받습니다.
		List<String> alphabetList = Arrays.asList("a","b","c","d","e");
		
		
		int index=0;
		//순서 for 문의 회전 순서를 정확히 이해하고 
		for(String item : alphabetList) { 
			index++;
			
			
			
			System.out.println(index);
			
			
		}
		
		return alphabetList;
	}
	
	
//재할당을 하고 증가하고 그렇다면은 alphabetList
	//1. 재할당
	//int index=0;
	
	public static void main(String[] args) {
		EX01 item = new EX01(); {
			//객체 생성 후 item이란 변수명 설정
			item.tempAlphabetList();
			//메인에 있는 것을 불러오는 것
		}
		

	}

}
