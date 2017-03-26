/**
 * 
 */
package com.springboot.db.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.QueryUtils.QueryParam;
import com.springboot.db.DataAccessor;
import com.springboot.exception.DataAccessException;

/**
 * @author psiva This
 */

@Repository
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = DataAccessException.class)
@SuppressWarnings("unchecked")
public class DataAccessorImpl implements DataAccessor, Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public <T> List<T> getList(String queryString, List<QueryParam<?>> params) throws DataAccessException {
		Object obj = null;
		Session session = sessionFactory.openSession();
		if (queryString != null) {
			Query query = session.createQuery(queryString);
			setParam(params, query);
			obj = query.list();
		}

		return (List<T>) obj;
	}

	@Override
	public <T> T getObject(String query, List<QueryParam<?>> params) {
		return null;
	}

	@Override
	public <T> T getObject(String query) {
		return null;
	}

	@Override
	public <T> List<T> getList(String queryString) {
		Object obj = null;
		Session session = sessionFactory.openSession();
		if (queryString != null) {
			Query query = session.createQuery(queryString);
			obj = query.list();
		}
		return (List<T>) obj;
	}

	@Override
	public <T> T getObjectWithNamedQuery(String namedQuey) {
		Session session = sessionFactory.openSession();
		Query query = session.getNamedQuery(namedQuey);
		return (T) query.uniqueResult();
	}

	@Override
	public <T> T getListWithNamedQuery(String namedQuey, List<QueryParam<?>> params) {
		Session session = sessionFactory.openSession();
		Query query = session.getNamedQuery(namedQuey);
		setParam(params, query);
		return (T) query.uniqueResult();
	}

	@Override
	public <T> List<T> getListWithNamedQuery(String namedQuey) {
		Session session = sessionFactory.openSession();
		Query query = session.getNamedQuery(namedQuey);
		return (List<T>) query.list();
	}

	private void setParam(List<QueryParam<?>> params, Query query) {
		for (QueryParam<?> queryParam : params) {
			if (queryParam.getValue().getClass().equals(List.class)) {
				List<?> parameter = (List<?>) queryParam.getValue();
				query.setParameterList(queryParam.getName(), parameter);
			} else {
				query.setParameter(queryParam.getName(), queryParam.getValue());
			}
		}
	}
}
