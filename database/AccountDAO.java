package database;

import model.*;

public class AccountDAO extends AbstractDAO<Account> {

	public AccountDAO() {
		super();
	}

	public Account findById(int id) {
		return super.findByAs(id,"idaccount");
	}

	public int insertAccount(Account acc) {
		return insert(acc);
	}
	
	public int updateAccount(Account account, int id) {
		AccountDAO accountDao = new AccountDAO();
		Account o = accountDao.findById(id);
		if (o == null) {
			System.out.println("Cannot update account: couldn't be found");
			return -1;
		}
		return update("idaccount",id,account);
	}
	
	public int deleteAccount(int id) {
		Account o = this.findById(id);
		if (o == null) {
			System.out.println("Cannot delete account: couldn't be found");
			return -1;
		}
		return delete("idaccount",id);
	}
}
