package com.whaty.products.web.dao;

import java.io.Serializable;

public interface IUserDAO<T> extends Serializable{

	/**
	 * 保存
	 * @param transientInstance
	 * @return 返回包含主键实体类
	 */
	public T save(T transientInstance) ;
	
}
