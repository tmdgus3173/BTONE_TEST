package hello0211;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class localDate3 {

	public static void main(String[] args) {
		
		 String nowDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
	        //오늘날짜가 나옵니다. 20230211 형식으로 말이죠.
		 
		 String myDate = "19951214";
	
		 
		 
		 
		 
		 
		 
		 
//		 System.out.println(myDate);
//		 System.out.println(nowDate);
		 
//		 System.out.println(myDate.compareTo(nowDate));
		 
		 
		 
		 
	}

}
