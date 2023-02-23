package hello0218;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainBook {
	// 도서관 대여 프로그램
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// ************************************************************
		// BookVo = 도서에 대한 정보

		// // 도서번호
		// private String bNo;
		// //제목
		// private String bTitle;
		// //저자
		// private String bAuthor;
		// //장르,
		// private String bGenre;
		// //대출가능여부
		// private String bAvailable = "Y";

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
		String num = "1";

		switch (num) {
		case ("1"):
			System.out.println("1을 입력하셨습니다.");
			// 도서 등록
			mainBook.insertBook(bookVo);

			break;

		case ("2"):
			mainBook.selectBook("슬");

//			
			mainBook.selectBookStream("홍");

			// 제목으로 검색 indexOf
			// 단건 검색해서 도서의 다건이 검색되도록 (ex 네이버검색창)

			// if String 이 제목일경우
			// 그거에 해당하는 모든 정보가 출력된다.

			break;

		case ("3"):
			// 도서 업데이트

			InfoVo infoVo = new InfoVo();
			BookVo updateBookVo = new BookVo();

			infoVo = mainBook.updateBook(updateBookVo);

			System.out.println("3");

			break;

		default:
			System.out.println("해당하는 기능이 없습니다.");
		}

	}

	// 1번 도서 등록
	public void insertBook(List<BookVo> bookVoList) {

//			, InfoVo infoVo

//			1) 등록 단건, 다건 가능
//			2) bNo가 중복일시 에러 처리 (에러 메세지 "중복된 bNo 가 존재합니다.")
//			3) 현재 1,2,3 의 bNo 가 존재하여 bNo 미 입력시 4로 저장
//			MainBook mainBook = new MainBook();
		List<BookVo> booksList = getBookInfo();
		// 책 목록을 쫙 불러서
//			System.out.println("책 목록 : " + booksList);
//			System.out.println("사이즈 : " + booksList.size());

		List<BookVo> insertBookList = new ArrayList<BookVo>();
		// 이게 이제 책을 등록하는 새로운 리스트이빈다.
		insertBookList.add(new BookVo("", "헌터X헌터", "토가시 요시히로", "만화", "Y"));
//		insertBookList.add(new BookVo("", "귀멸의칼날", "고토게 코요하루", "만화", "Y"));

		// 책 등록
		
		// 중복인 번호를 지정 아래 조건문에 넣으려구요.
		
		for (BookVo insertList : insertBookList) {
			// 추가된 책들을 불러온다.		
			int lastListSize = booksList.size()-1;
//			System.out.println("라리사 : " + lastListSize);
			// 리스트 목록이 몇개인지 찾는다. 
			for (BookVo bookVo : booksList) {
				// 기존에 있던 책 목록을 가지고온다.

////					
				for (int i = 0; i < lastListSize; i++) {
					// 1~3까지 쏵 돌리면서 -> 현재 들어가 있는 책의 갯수만큼 반복시키켠서

					// 일단 책 번호에 대한 변수를 지정해줘야겠지? 그리고 그것은

					if (bookVo.getbNo().equals(insertList.getbNo())) {
						// 만약 기존 책 No와 새로 넣은 책의 No가 같다면?
						String duplicationNo = bookVo.getbNo();
						// 중복인 번호를 bookVo에서 가지고오나 insertList에서 가지고오나 같다.

						System.out.println("중복 번호 : " + duplicationNo);
						System.out.println("책 번호 중복입니다.");
						return;
						// 중복이 나올 경우 의미없이 돌지않고 바로 빠져나올 수 있게 했다.
					}

				}
			}

				if (insertList.getbNo().equals("")) {
					// 만약 번호가 비어있다면 자동적으로 번호가 입력이 되게 할거에요.

					BookVo bookNo = bookVoList.get(lastListSize);
					// lastListSize 책의 마지막 갯수를 가져와사ㅓ bookNo에 넣고
					
					int lastBookNo = Integer.parseInt(bookNo.getbNo());
					// 새로운 빈칸 bNo에 들어갈 번호
					System.out.println("bNo 증가 전 : " + lastBookNo);
					// 그 마지막 책의 번호를 정수형으로 바꿔서 lastBookNo에 넣어준다.
					lastBookNo++;
					System.out.println("bNo 증가 후 : " + lastBookNo);
					// 그리고 거기에 ++ 시켜준다. 그러면 책이 총 3권 있으면 다음은 ++되서 4가 되는거다.
					String newBookNo = String.valueOf(lastBookNo);
					// 그리고 위에서 만들어진 lastBookNo를 문자화 시켜서 newBookNo에 넣어준다ㅣ
					
					insertList.setbNo(newBookNo);
					// 등록한 책의 리스트에서 책 번호를 위에서 정의한 newBookNo로 재정의해준다.

					// 변수에 넘버의 MAX값을 가지고 와서 +1을 시키는 것을 지정해주고
					// 그 변수를 setNo(변수명) 으로 지정해주면 No가 자동으로 올라가는 것을 설정해줄 수 있지않을까?
					// 허나 이건 좀 천천히 생각해보자.

					booksList.addAll(insertBookList);
					// 북 리스트에 인서트북리스트를 전부 이어붙인다

					System.out.println("등록 후 책 리스트");
					System.out.println(booksList);
					// 최종 출력

				} else {
					booksList.add(insertList);
					System.out.println("등록 후 책 리스트");
					System.out.println(booksList);
					// 값들이 다 잘 들어가 있으면 정상적으로 들어간다.
				}

		} // 1번 for의 끝

	}

	// 2번 도서 단건 조회
	public List<BookVo> selectBook(String bookName) {

		List<BookVo> selectBookList = getBookInfo();
		// 책 리스트를 가지고 온다.

		for (BookVo bookVo : selectBookList) {
//				System.out.println("list : " + bookVo);
			// 책들의 정보를 쫘라라라라ㅏ 가져와주고요.
			if (bookVo.getbTitle().indexOf(bookName) != -1) {
				// 이름이 완전히 일치하고 && 한글자라도 포함되어있으면 검색이 되는 if문을 만든다.
				System.out.println("2번 책검색 결과 : " + bookVo);
			}
		}

//			bookVo.getbTitle().equals(bookName) || 

		return selectBookList;
	}

	// 스트림으로 2번을 풀어보자.
	public List<BookVo> selectBookStream(String bookName) {
		List<BookVo> sBookVoList = getBookInfo();

		List<BookVo> selectBookList = sBookVoList.stream().filter(i -> i.getbTitle().indexOf(bookName) != -1)
				.collect(Collectors.toList());

		System.out.println("2번 스트림으로 검색한 결과 : " + selectBookList);

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

	// 3번 도서 정보 업데이트
	public InfoVo updateBook(BookVo bookVo) {

		// 1)
		return null;
	}

	// 책 정보 리스트
	public List<BookVo> getBookInfo() {

		MainBook mainBook = new MainBook();

		List<BookVo> bookLVoList = new ArrayList<>();

		mainBook.setBaseBookVo(bookLVoList);

//		System.out.println("bookLVoList : " + bookLVoList);

		return bookLVoList;
	}

	// 북vo 기본정보 셋팅
	public List<BookVo> setBaseBookVo(List<BookVo> bookLVoList) {
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

//		BookVo bookCVo = new BookVo();
//		
//		bookBVo.setbNo("4");
//		bookBVo.setbAuthor("미우라 켄타로");
//		bookBVo.setbTitle("베르세르크");
//		bookBVo.setbGenre("만화");
//		bookLVoList.add(bookCVo);

		return bookLVoList;

	}
}