//계정
public class RSPAccount {
	private String email; // 이메일
	private String passwd; // 패스워드
	
	public String getEmail() {//이메일 getter
		return email;
	}

	public void setEmail(String email) {//이메일 setter
		this.email = email;
	}

	public String getPasswd() {//패스워드 getter
		return passwd;
	}

	public void setPasswd(String passwd) {//패스워드 setter
		this.passwd = passwd;
	}

	public RSPAccount(String email, String passwd) {
		this.email = email;
		this.passwd = passwd;
	}
	
	public String toString() {
		return "Id: " + email + "\nPassword: " + passwd;  
	}
}
