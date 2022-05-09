package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Doctor;
import com.example.demo.model.Login;
import com.example.demo.service.Doctorservice;
import com.example.demo.service.Loginservice;

 

@Controller
public class DoctorController {
	@Autowired
	private Doctorservice service;
	
	@Autowired
	private Loginservice rservice;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveDoctor(@ModelAttribute("doctor") Doctor doctor)
	{	
		System.out.println(doctor.getFname());
		rservice.save(new Login("Doctor",doctor.getPassword(),doctor.getLoginid()));
		service.save(doctor);
		return "redirect:/Admin/Home";
	}
	
	@GetMapping(value = "/Doctor/Home")
	public String Doctorpage()
	{
		return "Doctor";
	}
	
}
