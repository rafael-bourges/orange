package com.orangetalents.manager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.orangetalents.manager.dao.UserRepository;
import com.orangetalents.manager.entities.User;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/new")
	public String displayUsers(Model model ) {
		
		User anUser = new User(); 
		
		model.addAttribute("user", anUser);
		
		return "new-user";
	}

	@PostMapping("/save")
	public String createUser(User user, Model model ) {
		userRepo.save(user);
		
		return "redirect:/users/new";
	}
}

