package test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num=Integer.parseInt(scan.nextLine());
		
		for(int a=1; a<=num; a++) {
			System.out.println("뽈롱");
		}
		
				}
}
