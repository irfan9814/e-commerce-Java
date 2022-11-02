
public class Admin extends User {
	private String userId="";
	private String password="";
	private String LoginStatus="";
	private Cart cart;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLoginStatus() {
		return LoginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		LoginStatus = loginStatus;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public String getPassword() {
		return password;
	}

	public void setUserid(String nextLine) {
		// TODO Auto-generated method stub
		
	}

	public void setPassword(String nextLine) {
		// TODO Auto-generated method stub
		
	}

	public boolean verifyuserid() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public boolean verifypass() {
		// TODO Auto-generated method stub
		return true;
	}

	public Boolean verifyUser() {
		// TODO Auto-generated method stub
		return true;
	}

}
