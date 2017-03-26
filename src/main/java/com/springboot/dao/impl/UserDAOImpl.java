/**
 * 
 */
package com.springboot.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.QueryUtils.QueryParam;
import com.springboot.dao.UserDAO;
import com.springboot.db.DataAccessor;
import com.springboot.models.User;

/**
 * @author psiva
 *
 */

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private DataAccessor dataAccessor;

	@Override
	public List<User> getAllUsers() {

		return dataAccessor.getListWithNamedQuery("getAllUser");
	}

	@Override
	public User getUserByEmail(String email) {

		QueryParam<String> qp = new QueryParam<>("email", email);
		List<QueryParam<?>> qps = new ArrayList<>();
		qps.add(qp);

		return dataAccessor.getListWithNamedQuery("getUserByEmail", qps);
	}

}
