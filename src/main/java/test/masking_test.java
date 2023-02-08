package test;

import java.util.Scanner;

public class masking_test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("이름을 적으세요 -> ");
		
		String name = scanner.nextLine();
		
		  
		  int cname = 1;
		  //바꾸고 싶은 글자 위치
		  int lname = name.length();
		  //문자열의 길이
		  
		  //바꿀 문자열의 위치
		  
		  System.out.println("[마스킹 전]");
		  System.out.println("이름 : "+name);
		  System.out.println("이름 길이 : "+name.length());
		  
		  
		  //자 여서 이제 ★이거를 글자수 1부터 시작해서 length까지 범위를 잡고 반복시키면
		  //그 딱 전까지만 별이 z쳐지겠죠?
		  for(int i=0; i < name.length(); i++) {
			  
		  }
		  if(name.length()!=2) {
			  name = name.substring(0, cname) + '★' + name.substring(cname - 1);
		  }
		  else if(name.length()>3) {
			  name = name.substring(0, cname) + '★' + name.substring(cname +2);
		  }
		  
		  
		  
		  
		  
		  System.out.println();
		  //한줄 내리기
		  
		  System.out.println("[마스킹 후]");
		  System.out.println(name);
		  
		 

	}

}
