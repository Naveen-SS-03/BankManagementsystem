package com.capg.service;



import java.util.List;

import com.capg.entity.Model;

public interface UserService {
	public long save(Model user);
	public Model get(long id);
	public List<Model> list();
	public Model update(long id, Model user);
	public void delete(long id);
	public boolean  existsByNameAndPassword(String name,String password);
}
