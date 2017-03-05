/**
 * 
 */
package com.practice.usermgmt.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.practice.usermgmt.beans.User;

/**
 * @author gauta
 *
 */
public class GetUsersResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1874040122229354989L;
	private List<User> users;

	/**
	 * @return the users
	 */
	public List<User> getUsers() {
		if(null == users){
			users = new ArrayList<>();
		}
		return users;
	}

	/**
	 * @param users
	 *            the users to set
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}

}
