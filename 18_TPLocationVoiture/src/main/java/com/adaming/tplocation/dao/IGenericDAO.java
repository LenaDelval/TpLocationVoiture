package com.adaming.tplocation.dao;

import java.util.List;

public interface IGenericDAO<T> {
	
	public  T add(T t);
	
	public T update(T t);
	
	public List<T> getAll();
	
	public T getById(Long pId);

}
