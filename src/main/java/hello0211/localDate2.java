package hello0211;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class localDate2 {

	public static void main(String[] args) throws ParseException {
		
		  	String nowDate = LocalDate.now().toString();
		  	//오늘 날짜
	        String anotherDate = "1995-12-14";   
	        //설정한 날짜

	        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	        
	        //String formateDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
	        //오늘날짜가 나옵니다. 20230211 형식으로 말이죠.
	        
	        System.out.println(format);
	        
	        //형식

	        Date nowDateFormat = format.parse(nowDate);
	        Date anotherDateFormat = format.parse(anotherDate);
	        
	        
	        long differentSecond = (nowDateFormat.getTime() - anotherDateFormat.getTime()) / 1000;
	        
	        //System.out.println(differentSecond);
	        
	        long differentDay = (differentSecond / (24 * 60 * 60)) + 1;
	        //60 X 60 X 24 X 1 = 86,400 초
	        
	        
	        System.out.println("요일차이 = " + differentDay);	// 2881

	}

}
