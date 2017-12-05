package cn.zhang.mybatis.dao;

import cn.zhang.mybatis.pojo.User;

public interface UserDao {
	
	public User findUserById(Integer id);
}
