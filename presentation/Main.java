package presentation;

import database.*;
import model.*;

public class Main {

	public static void main(String[] args) {
		
		User user = new User("anahan","blabla");
		UserDAO us = new UserDAO();
		us.insertUser(user);
		
		Account new1 = new Account("Ana Han",user.getIdUser(),"Cluj-Napoca","123456","blabla@hotmail.com");
		AccountDAO acc = new AccountDAO();
		acc.insertAccount(new1);
		
	}

}
