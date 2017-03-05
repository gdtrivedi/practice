/**
 * 
 */
package com.practice.usermgmt.models;

import java.io.Serializable;

import com.practice.usermgmt.beans.User;

/**
 * @author gauta
 *
 */
public class CreateUserRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2971700161662812973L;
	private User user;

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

}
