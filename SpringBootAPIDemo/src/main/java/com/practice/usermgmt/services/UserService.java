/**
 * 
 */
package com.practice.usermgmt.services;

import java.util.List;

import com.practice.usermgmt.entities.User;

/**
 * @author gauta
 *
 */
public interface UserService {

	public Integer add(User user);
	public Integer update(User user);
	public List<User> getAll();
	public User getById(Integer id);
	public void delete(Integer id);
}
