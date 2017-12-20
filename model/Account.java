package model;

public class Account {
	
	private static int noAccounts = 0;
	private int idAccount;
	private String name;
	private int idUser;
	private String address;
	private String phone;
	private String email;
	//as a future improvement: sync with Google, Facebook etc.
	
	public Account(String name, int idUser, String address, String phone, String email) {
		noAccounts++;
		this.idAccount = noAccounts;
		this.name = name;
		this.idUser = idUser;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	
	public Account(int idUser) {
		noAccounts++;
		this.idAccount = noAccounts;
		this.idUser = idUser;
	}

	public int getIdAccount() {
		return idAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdUser() {
		return idUser;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
