package hello0211;

import java.sql.Date;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class localDate {

	public static void main(String[] args) throws ParseException {
		
		LocalDate myDate = LocalDate.of(1995, Month.DECEMBER, 14);
		LocalDate todayDate = LocalDate.of(2023, Month.FEBRUARY, 11);
		//위에 두개는 특정 날자를 구하는 방법이다.
		
		LocalDate today = LocalDate.now();
		//오늘 날짜를 구하기.
//		System.out.println(today);
//		System.out.println(myDate);
//		//그렇다면 오늘(today)과 특정 날짜를 비교하면될거같은데
//		
//		Period compare = Period.between(myDate, today);
//		//myDate today의 비교
//		
//		System.out.println("차이는? " + compare.getYears() + "년 " + compare.getMonths() + "월 " + compare.getDays() + "일 입니다.");
//		//년 월 일로 쪼개서 나옴. 너무 옛날거라 기각.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public void dateCompare() {
		localDate compareDate = new localDate();
		
	}
	
	
}
