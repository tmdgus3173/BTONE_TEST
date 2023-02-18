package hello0218;

import java.util.List;

public class InfoVo {

	private List<BookVo> bookVoList; //도서목록
	
	private List<UserVo> userVoList; // 사용자목록
	
//	private List<RentalVo> rentalVoList; //대여목록

	public List<BookVo> getBookVoList() {
		return bookVoList;
	}

	public void setBookVoList(List<BookVo> bookVoList) {
		this.bookVoList = bookVoList;
	}

	public List<UserVo> getUserVoList() {
		return userVoList;
	}

	public void setUserVoList(List<UserVo> userVoList) {
		this.userVoList = userVoList;
	}

//	public List<RentalVo> getRentalVoList() {
//		return rentalVoList;
//	}
//
//	public void setRentalVoList(List<RentalVo> rentalVoList) {
//		this.rentalVoList = rentalVoList;
//	}

	@Override
	public String toString() {
		return "InfoVo [bookVoList=" + bookVoList + ", userVoList=" + userVoList 
				+ ", getBookVoList()=" + getBookVoList() + ", getUserVoList()=" + getUserVoList()
				+ ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}