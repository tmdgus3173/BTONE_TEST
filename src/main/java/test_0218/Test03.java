package test_0218;

import java.util.ArrayList;

public class Test03 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		
		System.out.println(arrList);
		
		for(int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
			
		arrList.remove(3);
			
		}

	}

}
