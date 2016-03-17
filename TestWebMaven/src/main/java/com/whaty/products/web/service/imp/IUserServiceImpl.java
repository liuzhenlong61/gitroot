package com.whaty.products.web.service.imp;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whaty.products.web.dao.IUserDAO;
import com.whaty.products.web.service.IUserService;

@Service("iUserService")
public class IUserServiceImpl<T> implements IUserService<T> {

	@Autowired
	private IUserDAO iUserDAO;
	/**
	 * 保存
	 */
	public T save(T transientInstance) throws Exception {
		T instance = null;
		try {
			instance = (T) iUserDAO.save(transientInstance);
		} catch (RuntimeException e) {
			throw e;
		}
		return instance;
	}
	
	public T saveUser(T transientInstance, T transientInstance1)
			throws Exception {
		T instance = null;
		try {
			instance = (T) iUserDAO.save(transientInstance);
			instance = (T) iUserDAO.save(transientInstance1);
		} catch (RuntimeException e) {
			throw e;
		}
		return instance;
	}
	
	public IUserDAO getiUserDAO() {
		return iUserDAO;
	}
	public void setiUserDAO(IUserDAO iUserDAO) {
		this.iUserDAO = iUserDAO;
	}

}
