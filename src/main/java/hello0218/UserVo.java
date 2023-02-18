package hello0218;

public class UserVo {

	// 회원번호
	private String uNo;
	//회원명
    private String uName;
    //회원등급 
    private String uGrade;
    //주소
    private String uAddres; 
    //이메일
    private String uEmail;
    
	public String getuNo() {
		return uNo;
	}
	public void setuNo(String uNo) {
		this.uNo = uNo;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuGrade() {
		return uGrade;
	}
	public void setuGrade(String uGrade) {
		this.uGrade = uGrade;
	}
	public String getuAddres() {
		return uAddres;
	}
	public void setuAddres(String uAddres) {
		this.uAddres = uAddres;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	
	@Override
	public String toString() {
		return "UserVo [uNo=" + uNo + ", uName=" + uName + ", uGrade=" + uGrade + ", uAddres=" + uAddres + ", uEmail="
				+ uEmail + ", getuNo()=" + getuNo() + ", getuName()=" + getuName() + ", getuGrade()=" + getuGrade()
				+ ", getuAddres()=" + getuAddres() + ", getuEmail()=" + getuEmail() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	} 
    
}