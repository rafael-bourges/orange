package com.orangetalents.manager.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.orangetalents.manager.entities.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Long>{

	@Override
	public List<Vehicle> findAll();
}
