/**
 * 
 */
package com.practice.usermgmt.models;

import java.io.Serializable;

/**
 * @author gauta
 *
 */
public class CreateUserResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -432676480312914511L;
	private Integer userId;

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
