package com.orangetalents.manager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.orangetalents.manager.dao.UserRepository;
import com.orangetalents.manager.dao.VehicleRepository;
import com.orangetalents.manager.entities.User;
import com.orangetalents.manager.entities.Vehicle;

@Controller
public class DataController {
	
	
	@Autowired
	VehicleRepository vehicleRepo;
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/data")
	public String displayData(Model model) {
		List<Vehicle> vehicles = vehicleRepo.findAll();
		model.addAttribute("vehiclesList", vehicles);
		
		List<User> users = userRepo.findAll();
		model.addAttribute("usersList", users);
		
		return "data";
		
		
	}
}
