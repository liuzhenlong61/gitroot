package com.whaty.products.web.dao.imp;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.whaty.products.web.dao.IUserDAO;

@Repository("iUserDAO")
public class IUserDAOImp<T> extends HibernateDaoSupport implements IUserDAO<T> {

	/**
	 * 保存
	 */
	public T save(T transientInstance) {
		
		try {
			getHibernateTemplate().saveOrUpdate(transientInstance);
			return transientInstance;
		} catch(RuntimeException e) {
			throw e;
		}
	}
	
	@Autowired
    public void setSessionFactoryOverride(SessionFactory sessionFactory)
    {
        super.setSessionFactory(sessionFactory);
    }

}
