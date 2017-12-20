package database;

import model.*;

public class UserDAO extends AbstractDAO<User> {

	public UserDAO() {
		super();
	}
		
	public User findById(int id) {
		return super.findByAs(id,"iduser");
	}

	public int insertUser(User user) {
		return insert(user);
	}
	
	public int updateUser(User user, int id) {
		User o = this.findById(id);
		if (o == null) {
			System.out.println("Cannot update user: couldn't be found");
			return -1;
		}
		return update("name",id,user);
	}
	
	public int deleteUser(int id) {
		User o = this.findById(id);
		if (o == null) {
			System.out.println("Cannot update user: couldn't be found");
			return -1;
		} else if (o.isRidingBike()) {
			System.out.println("Cannot update user: currently riding bike");
			return -1;
		}
		return delete("iduser",id);
	}
}