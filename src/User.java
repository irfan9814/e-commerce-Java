
public abstract class User {
	protected String userId="";
	private String password="";
	private String LoginStatus="";
	abstract Boolean verifyUser();
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoginStatus() {
		return LoginStatus;
	}
	public void setLoginStatus(String loginStatus) {
		LoginStatus = loginStatus;
	}
	

}
