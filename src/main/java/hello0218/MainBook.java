package hello0218;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MainBook {
	// 도서관 대여 프로그램
	public static void main(String[] args) {
		
		MainBook mainBook = new MainBook();
		
		//************************************************************
		// BookVo = 도서에 대한 정보
		
			//		// 도서번호
			//		private String bNo;
			//		//제목
			//	    private String bTitle;
			//	    //저자
			//	    private String bAuthor;
			//	    //장르,
			//	    private String bGenre;
			//	    //대출가능여부
			//	    private String bAvailable = "Y";
		
		
		
		// 값 셋팅 매서드
		// 책 셋팅
		List<BookVo> bookVo = mainBook.getBookInfo();
		
		System.out.println(bookVo);
		
		
		// 기능을 사용하고자 번호
		String num = "3";
		
		switch (num) {
		case ("1"):
			//도서 등록
			mainBook.insertBook(bookVo);
			break;
			
			
		case ("2"):
			mainBook.selectBook(bookVo);
			break;
			
		case ("3"):
			//도서 업데이트
			
			InfoVo infoVo = new InfoVo();
			BookVo updateBookVo = new BookVo();
		
			infoVo = mainBook.updateBook(updateBookVo);
			break;	
			
	
		default:
			System.out.println("해당하는 기능이 없습니다.");
		}		
	
	}
	
		//1번 도서 등록
		public void insertBook(List<BookVo> bookVoList) {
			
//			1) 등록 단건, 다건 가능
//			2) bNo가 중복일시 에러 처리 (에러 메세지 "중복된 bNo 가 존재합니다.")
//			3) 현재 1,2,3 의 bNo 가 존재하여 bNo 미 입력시 4로 저장
		}
		
		//2번 도서 단건 조회
		public void selectBook(List<BookVo> bookVoList) {
			
			//제목으로 검색 indexOf
			//단건 검색해서 도서의 다건이 검색되도록 (ex 네이버검색창)
			
			
			
		}
		
		//3번 도서 정보 업데이트
		public InfoVo updateBook(BookVo bookVo) {
			
			//1)
			return null;
		}
	
	// 책 정보 리스트
	public List<BookVo> getBookInfo(){
		
		MainBook mainBook = new MainBook();
		
		List<BookVo> bookLVoList = new ArrayList<>();
		
		mainBook.setBaseBookVo(bookLVoList);
		
		return bookLVoList;
	}
	
	
	
	//북vo 기본정보 셋팅
	public void setBaseBookVo (List<BookVo> bookLVoList) {
		BookVo bookVo = new BookVo();
		
		bookVo.setbNo("1");
		bookVo.setbAuthor("허균");
		bookVo.setbTitle("홍길동전");
		bookVo.setbGenre("픽션");
		bookLVoList.add(bookVo);
	
		
		BookVo bookAVo = new BookVo();
		
		bookAVo.setbNo("2");
		bookAVo.setbAuthor("이노우에 타케히코");
		bookAVo.setbTitle("슬램덩크");
		bookAVo.setbGenre("만화");
		bookLVoList.add(bookAVo);
		
		
		BookVo bookBVo = new BookVo();
		
		bookBVo.setbNo("3");
		bookBVo.setbAuthor("박경리");
		bookBVo.setbTitle("토지");
		bookBVo.setbGenre("현대소설");
		bookLVoList.add(bookBVo);
		
	}
}