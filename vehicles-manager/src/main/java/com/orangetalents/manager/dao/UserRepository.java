package com.orangetalents.manager.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.orangetalents.manager.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

	@Override
	public List<User> findAll();
	
}
