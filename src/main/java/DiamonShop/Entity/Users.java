package DiamonShop.Entity;

public class Users {
	private long id;
	private String password, display_name,address,user;
	public Users() {
		super();
	}
	
	public Users(long id, String password, String display_name, String address, String user) {
		super();
		this.id = id;
		this.password = password;
		this.display_name = display_name;
		this.address = address;
		this.user = user;
	}

	
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
