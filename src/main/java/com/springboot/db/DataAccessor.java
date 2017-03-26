/**
 * 
 */
package com.springboot.db;

import java.util.List;

import com.springboot.QueryUtils.QueryParam;
import com.springboot.exception.DataAccessException;

/**
 * @author psiva
 *
 */
public interface DataAccessor {

	<T> T getObject(String query, List<QueryParam<?>> params);

	<T> T getObject(String query);

	<T> List<T> getList(String query, List<QueryParam<?>> params) throws DataAccessException;

	<T> List<T> getList(String query);

	<T> T getObjectWithNamedQuery(String query);

	<T> List<T> getListWithNamedQuery(String query);

	<T> T getListWithNamedQuery(String query, List<QueryParam<?>> params);

}
