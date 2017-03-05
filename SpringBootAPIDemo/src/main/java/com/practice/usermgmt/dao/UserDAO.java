/**
 * 
 */
package com.practice.usermgmt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practice.usermgmt.entities.User;

/**
 * @author gauta
 *
 */
@Repository
public interface UserDAO extends CrudRepository<User, Integer> {

}
