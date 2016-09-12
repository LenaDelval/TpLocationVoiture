package com.adaming.tplocation.service;

import java.util.List;

public interface IGenericService<T> {
	
	public  T add(T t);
	
	public T update(T t);
	
	public List<T> getAll();
	
	public T getById(Long pId);
	

}
