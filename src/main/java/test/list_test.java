package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list_test {

	public static void main(String[] args) {
		List<String> listA = new ArrayList<String>();
		 
		listA.add("김삿갓");
        listA.add("홍아리");
        listA.add(new String("홍길동"));
        listA.add(1, "1번째 요소값");
		
        System.out.println(listA);
 
 
        // 인덱스를 통한 조회
        String element0 = listA.get(0);
        String element1 = listA.get(1);
        String element3 = listA.get(2);
 
        //Iterator 통한 전체 조회
      //  Iterator<String> iterator = listA.iterator();
       // while (iterator.hasNext()) {
       //     String element = iterator.next();
       //     System.out.println(element);
        }
 
        //for-loop 통한 전체 조회
       // for(Object object : listA) {
       //     String element = (String) object;
        //}
 
 
        // 삭제하기
        //System.out.println(listA.remove(0));
        //System.out.println(listA.remove("홍길동"));
 
 
		// 존재 여부를 확인하고 싶을 때
        //System.out.println(listA.contains("홍길동"));
 
        // 홍길동 앞에 값 추가
        //int index = listA.indexOf("홍길동");
        //listA.add(index, "홍길동 앞에 값 추가");
	}


	


