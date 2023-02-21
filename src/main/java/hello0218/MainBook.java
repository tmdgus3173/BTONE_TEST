package hello0218;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class MainBook {
	// 도서관 대여 프로그램
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
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
		
		
		
		

		MainBook mainBook = new MainBook();
		
		List<BookVo> bookVo = mainBook.getBookInfo();
		
		List<String> selectBookInfo = new ArrayList<>();
		
//		System.out.println("테스트 : " + selectBookInfo);
		
		
		
		// 기능을 사용하고자 번호
		
//		System.out.print("1. 도서등록 2. 도서조회 3. 도서수정 ->");
//		String num = scan.nextLine();
//		
		String num = "2";
		
		switch (num) {
		case ("1"):
			//도서 등록
			mainBook.insertBook(bookVo);
			
			System.out.println("1의 경우");
		
			break;
			
			
		case ("2"):
//			mainBook.selectBook(bookVo);
			
			System.out.println("책 이름 : ");
		
			String bName = scan.nextLine();
			
//			String bN
			
//			System.out.print(mainBook.getBookNameByName("책이름을 입력했더니? -> " + bName));
			
			
			
			
			
			
			
			
			
			
			
			
			 
			
			
		
		
		
			//제목으로 검색 indexOf
			//단건 검색해서 도서의 다건이 검색되도록 (ex 네이버검색창)
		
			//if String 이 제목일경우
			//그거에 해당하는 모든 정보가 출력된다.
		
		
			break;
			
		case ("3"):
			//도서 업데이트
			
			InfoVo infoVo = new InfoVo();
			BookVo updateBookVo = new BookVo();
		
			infoVo = mainBook.updateBook(updateBookVo);
			
			System.out.println("3");
			
			
			break;	
			
	
		default:
			System.out.println("해당하는 기능이 없습니다.");
		}		
	
	}
	
	
	
	
	
	
		//1번 도서 등록
		public List<BookVo> insertBook(List<BookVo> bookVoList) {
			
			
			
//			1) 등록 단건, 다건 가능
//			2) bNo가 중복일시 에러 처리 (에러 메세지 "중복된 bNo 가 존재합니다.")
//			3) 현재 1,2,3 의 bNo 가 존재하여 bNo 미 입력시 4로 저장
			MainBook mainBook = new MainBook();
			
			List<BookVo> insertBookList = mainBook.setBaseBookVo(getBookInfo());
			
			
			
			
			
			
			return insertBookList;
		}
		
		
		//2번 도서 단건 조회
		public List<BookVo> selectBook(String bookName) {
			
			List<BookVo> selectBookList = getBookInfo();
			
			for(BookVo bookVo : selectBookList) {
				if(bookVo.getbTitle().indexOf(bookName) != -1 || bookVo.getbTitle().equals(bookName)) {
					/*
					 *확인 필요함.
					 */
					System.out.println("테스트 : " + bookVo);
				}
			}
				return selectBookList;
		}
			
//			//제목으로 검색 indexOf
//			//단건 검색해서 도서의 다건이 검색되도록 (ex 네이버검색창)
//			
//			MainBook mainbook = new MainBook();
//			
//			List<BookVo> selectBookInfo = mainbook.getBookInfo();
//			//셀렉북인포에 리턴시키자
//			
//			System.out.println(selectBookInfo);
//			//리스트를 제대로 불러왔는지 확인했구요
//			
//			for(BookVo bookVo : selectBookInfo) {
//				System.out.println("test" + bookVo);
//				
//			}
			

	

		
//		public String getBookNameByName(String bTitle) {
//			
//			String getBookName = "";
//			String getBookList = "";
//			
////			List<String> booksName = new ArrayList<String>();
////			List<BookVo> booksList = selectBook(getBookInfo());
//			
////			for(BookVo bookVo : booksList) {
//				//쫙 돌려서
//				getBookName = bookVo.getbTitle();
//				//getBookName에 이름만 반복된 값을 넣는다~
//				if(getBookName.contains(bTitle)) {
//					//만약 그 반복된 이름들이 bTitle에 있을경우
//					if(getBookName.equals(bTitle));
//					//그리고 그 이름들이랑 bTitle이랑 같을 경우 
//					getBookList = bookVo.getbTitle();
//					//그 제목을 getBookList에 넣는다.
//				}
//				
//			}
//				
//			System.out.println(getBookList);
//			return getBookList;
//		}
//		
		
		
		
		
		
		
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
		
//		System.out.println("bookLVoList : " + bookLVoList);
		
		
		
		return bookLVoList;
	}
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//북vo 기본정보 셋팅
	public List<BookVo> setBaseBookVo (List<BookVo> bookLVoList) {
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
		
		
		return bookLVoList;
		
	}
}