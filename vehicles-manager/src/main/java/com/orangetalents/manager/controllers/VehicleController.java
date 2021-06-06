package com.orangetalents.manager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.orangetalents.manager.dao.VehicleRepository;
import com.orangetalents.manager.entities.Vehicle;

@Controller
@RequestMapping("/vehicles")
public class VehicleController {

		@Autowired
		VehicleRepository vehicleRepo;
		
		@GetMapping("/new")
		public String displayVehicles(Model model ) {
			
			Vehicle anVehicle = new Vehicle(); 
			
			model.addAttribute("vehicle", anVehicle);
			
			return "new-vehicle";
		}

		@PostMapping("/save")
		public String createVehicle(Vehicle vehicle, Model model ) {
			vehicleRepo.save(vehicle);
			
			return "redirect:/vehicles/new";
		}
	}

