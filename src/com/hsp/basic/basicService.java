package com.hsp.basic;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class basicService implements basicServiceInterface {

	@Resource
	private SessionFactory sessionFactory;
	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(obj);
	}

	@Override
	public List excuteQueryByPage(String hql, Object[] parameter, int pageNow,
			int pageSize) {
		// TODO Auto-generated method stub
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		if (parameter!=null && parameter.length>0){
			for (int i=0; i<parameter.length; i++){
				query.setParameter(i, parameter[i]);
			}
		}
		return query.setFirstResult((pageNow-1)*pageSize).setMaxResults(pageSize).list();
		
	}

	@Override
	public List execuateUpdate(String hql, Object[] parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List executeQuery(String hql, Object[] parameter) {
		// TODO Auto-generated method stub
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		if (parameter!=null && parameter.length>0){
			for (int i=0; i<parameter.length; i++){
				query.setParameter(i, parameter[i]);
			}
		}
		return query.list();
	}

	@Override
	public Object findById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		
		return this.sessionFactory.getCurrentSession().get(clazz, id);
	}

	public Object uniqueQuery(String hql, Object[] parameter){
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		if (parameter!=null && parameter.length>0){
			for (int i=0; i<parameter.length; i++){
				query.setParameter(i, parameter[i]);
			}
		}
		return query.uniqueResult();
	}
	
	public int queryPageCount(String hql, Object[]parameter, int pageSize){
		/*List list=this.executeQuery(hql, parameter);
		Iterator iterator=list.iterator();
		if (iterator.hasNext(0))*/
		Object obj=this.uniqueQuery(hql, parameter);
		int rowCount=Integer.parseInt(obj.toString());
		
		return (rowCount-1)/pageSize+1;
	}
	
	public void deleteById(Class clazz, Serializable id){
		Session session=this.sessionFactory.getCurrentSession();
		session.delete(this.findById(clazz, id));
	}
	
	public void update(Object obj){
		this.sessionFactory.getCurrentSession().update(obj);
	}
}
