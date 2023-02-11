package hello0211;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 날짜 비교 클래스
 */
public class EX01 {

   public static void main(String[] args)  throws ParseException {
      EX01 datecomparison = new EX01();
//      System.out.println("return : "  +datecomparison.comparisonDate("2023-02-12"));
      System.out.println("return : "  +datecomparison.comparisonDate2("2023-02-12"));
   }
   
   // 날짜 비교 하기
   public String comparisonDate(String dateInput)  {
      
      // 오늘 날짜 yyyy-MM-dd 로 생성
      String todayFormat = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
      System.out.println(todayFormat);
      
      // yyyy-MM-dd 포맷 설정
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
      
       String StartDate = dateFormat + " 00:00:01";
      
      //비교할 date와 today를데이터 포맷으로 변경
      Date date;
      int compare = 0;
      try {
         Date today = new Date(dateFormat.parse(StartDate).getTime()); // 오늘 날짜
         date = new Date(dateFormat.parse(dateInput).getTime());
         
         // compareTo 메서드를 통한 날짜 비교
         compare = date.compareTo(today);
         
         // 비교 분기
         if(compare > 0) {
              System.out.println("date가 today보다 큽니다.(date > today)");
            } else if(compare < 0) {
              System.out.println("today가 date보다 큽니다.(date < today)");
            } else {
              System.out.println("today와 date가 같습니다.(date = today)");
            }
         
      } catch (ParseException e) {
   
         return e.getMessage();
      } // 입력 받을 날짜
         System.out.println("123");
         return "";
      }
   
   
   // 날짜 비교 하기
   public String comparisonDate2(String dateInput)  throws ParseException{
      
      // 오늘 날짜 yyyy-MM-dd 로 생성
      String todayFormat = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
      System.out.println(todayFormat);
      
      // yyyy-MM-dd 포맷 설정
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
      
       String StartDate = dateFormat + " 00:00:01";
      
      //비교할 date와 today를데이터 포맷으로 변경
      Date date;
      int compare = 0;
   
         Date today = new Date(dateFormat.parse(StartDate).getTime()); // 오늘 날짜
         date = new Date(dateFormat.parse(dateInput).getTime());
         
         // compareTo 메서드를 통한 날짜 비교
         compare = date.compareTo(today);
         
         // 비교 분기
         if(compare > 0) {
              System.out.println("date가 today보다 큽니다.(date > today)");
            } else if(compare < 0) {
              System.out.println("today가 date보다 큽니다.(date < today)");
            } else {
              System.out.println("today와 date가 같습니다.(date = today)");
            }
         
       // 입력 받을 날짜
         System.out.println("123");
         return "";
      }   
   
}