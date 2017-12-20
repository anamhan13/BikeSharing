package model;

public class User {
	
	private int idUser;
	private String userName;
	private String password;
	private static int noUsers;
	private boolean ridingBike;
	
	public User(String userName, String password) {
		noUsers++;
		this.idUser = noUsers;
		this.userName = userName;
		this.password = password;
		this.ridingBike = false;
	}
	
	public int getIdUser() {
		return idUser;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public static int getNoUsers() {
		return noUsers;
	}
	
	public static void setNoUsers(int noUsers) {
		User.noUsers = noUsers;
	}

	public boolean isRidingBike() {
		return ridingBike;
	}

	public void setRidingBike(boolean ridingBike) {
		this.ridingBike = ridingBike;
	}

}
