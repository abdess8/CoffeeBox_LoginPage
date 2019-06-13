package com.abdessamad;

import com.abdessamad.dao.UserDao;
import com.abdessamad.entity.UserBean;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello w");
		
		UserBean user = new UserBean();
		user.setUserName("samad");
		user.setPassword("12345");
		user = UserDao.login(user);
		if (user.isValid()) {
			System.out.println("bitch");
		} else {
			System.out.println("Nop ");
		}

	}

}
