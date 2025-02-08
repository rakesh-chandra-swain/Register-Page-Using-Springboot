package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.domain.Register;
import com.nt.service.ResisterService;

@Controller

public class RegisterController {
	
	 @Autowired
	    private ResisterService registerService;
	 
	 @PostMapping("/")
	    public String saveRegister(@ModelAttribute Register register) {
	        registerService.saveRegister(register);
	        return "redirect:/register";
	    }
}
