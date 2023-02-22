package hello0218;

public class BookVo {

	// 도서번호
	private String bNo;
	//제목
    private String bTitle;
    //저자
    private String bAuthor;
    //장르, 
    private String bGenre;
    //대출가능여부
    private String bAvailable = "Y";
    
    public BookVo() {
    	
    }
	
	public BookVo(String bNo, String bTitle, String bAuthor, String bGenre, String bAvailable) {
		super();
		this.bNo = bNo;
		this.bTitle = bTitle;
		this.bAuthor = bAuthor;
		this.bGenre = bGenre;
		this.bAvailable = bAvailable;
	}
	public String getbNo() {
		return bNo;
	}
	public void setbNo(String bNo) {
		this.bNo = bNo;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbAuthor() {
		return bAuthor;
	}
	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}
	public String getbGenre() {
		return bGenre;
	}
	public void setbGenre(String bGenre) {
		this.bGenre = bGenre;
	}
	public String getbAvailable() {
		return bAvailable;
	}
	public void setbAvailable(String bAvailable) {
		this.bAvailable = bAvailable;
	}
	@Override
	public String toString() {
		return "BookVo [bNo=" + bNo + ", bTitle=" + bTitle + ", bAuthor=" + bAuthor + ", bGenre=" + bGenre
				+ ", bAvailable=" + bAvailable + ", getbNo()=" + getbNo() + ", getbTitle()=" + getbTitle()
				+ ", getbAuthor()=" + getbAuthor() + ", getbGenre()=" + getbGenre() + ", getbAvailable()="
				+ getbAvailable() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "\n" + "]";
	}
    
}