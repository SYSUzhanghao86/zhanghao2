package cn.zhang.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.zhang.mybatis.pojo.User;

/**
 * 原始Dao开发
 * @author lx
 *
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

	@Override
	public User findUserById(Integer id) {
		SqlSession sqlSession=super.getSqlSession();
		User user=sqlSession.selectOne("findUserById",id);
		return user;
	}

	
	
}
