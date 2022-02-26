package com.fund_for_change;

import org.springframework.beans.factory.annotation.Autowired;

import com.fund_for_change.services.UserService;
import com.fund_for_change.services.UserServiceImpl;

public class Test {
	public static void main(String[] args) {
		System.out.println("Fixing bugs......");
		UserServiceImpl service = new UserServiceImpl();
		service.loadUserByUsername("usr1");
	}
}
