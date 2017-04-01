package com.java1234.dao;    

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

import com.java1234.entity.User;


public class TestUserDao {
	
	private ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}

	@Test
	public void testFindUser() {
		
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		User u = new User();
		u.setUserName("java1234");
		u.setRoleName("系统管理员");
		
		System.out.println("设置user: " + u);
		
		User user = userDao.login(u);
		
		System.out.println("OK: " + user);
	}

}
 