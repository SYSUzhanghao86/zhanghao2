package cn.zhang.mybatis.junit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhang.mybatis.dao.UserDao;
import cn.zhang.mybatis.mapper.UserMapper;
import cn.zhang.mybatis.pojo.User;

import org.junit.Test;

public class JuintTest {

	@Test
	public void testMapper() throws Exception{
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper userMapper=ac.getBean(UserMapper.class);
		User user=userMapper.findUserById(1);
		System.out.println(user);
	}
	
	@Test
	public void testDao() throws Exception{
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao=ac.getBean(UserDao.class);
		User user=userDao.findUserById(1);
		System.out.println(user);
	}

}
