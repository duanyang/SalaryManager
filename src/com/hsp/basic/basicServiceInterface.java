package com.hsp.basic;

import java.io.Serializable;
import java.util.List;

public interface basicServiceInterface {
	
	public Object findById(Class clazz, Serializable id);
	
	public List executeQuery(String hql, Object[] parameter);
	
	public List excuteQueryByPage(String hql, Object[] parameter, int pageNow, int pageSize);

	public void add (Object obj);
	
	public List execuateUpdate(String hql, Object[] parameter);
	
	public Object uniqueQuery(String hql, Object[] parameter);
	
	public int queryPageCount(String hql, Object[]parameter, int pageSize);
	
	public void deleteById(Class clazz, Serializable id);
	
	public void update(Object obj);
}
