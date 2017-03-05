/**
 * 
 */
package com.practice.usermgmt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.usermgmt.dao.UserDAO;
import com.practice.usermgmt.entities.User;

/**
 * @author gauta
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO userDao;

	/* (non-Javadoc)
	 * @see com.practice.usermgmt.services.UserService#add(com.practice.usermgmt.entities.User)
	 */
	@Override
	public Integer add(User user) {
		User savedUser = userDao.save(user);
		return savedUser.getId();
	}

	/* (non-Javadoc)
	 * @see com.practice.usermgmt.services.UserService#update(com.practice.usermgmt.entities.User)
	 */
	@Override
	public Integer update(User user) {
		User savedUser = userDao.save(user);
		return savedUser.getId();
	}

	/* (non-Javadoc)
	 * @see com.practice.usermgmt.services.UserService#getAll()
	 */
	@Override
	public List<User> getAll() {
		return (List<User>) userDao.findAll();
	}

	/* (non-Javadoc)
	 * @see com.practice.usermgmt.services.UserService#getById(java.lang.Integer)
	 */
	@Override
	public User getById(Integer id) {
		return userDao.findOne(id);
	}

	/* (non-Javadoc)
	 * @see com.practice.usermgmt.services.UserService#delete(java.lang.Integer)
	 */
	@Override
	public void delete(Integer id) {
		userDao.delete(id);
	}

}
