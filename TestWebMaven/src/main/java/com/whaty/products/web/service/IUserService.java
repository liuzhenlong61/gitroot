package com.whaty.products.web.service;

public interface IUserService<T> {

	/**
	 * 保存
	 * @param transientInstance
	 * @return
	 * @throws Exception
	 */
	public T save (T transientInstance) throws Exception;
	
	public T saveUser (T transientInstance, T transientInstance1) throws Exception;
	
}
