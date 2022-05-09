package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Doctor;
import com.example.demo.service.Doctorservice;

@RequestMapping("/Admin")
@Controller
public class AdminController {
		@Autowired 
		private Doctorservice service;
		
	
		@RequestMapping("/Home")
	    public String Home(){
	    		return "adminhome";
	    }
		@RequestMapping("/Patient")
	    public String Patient(){
	    		return "Patient";
	    }
	    @RequestMapping("/AddDoctor")
	    public String AddDoctor(Model model){
	    		model.addAttribute("doctor",new Doctor());
	    		return "AddDoctor";
	    }
	    @RequestMapping("/Doctorlist")
	    public String 	Doctorlistpage(Model model){
	    	List<Doctor> listdoctor = service.listall();
			model.addAttribute("listdoctor",listdoctor);
	    		return "Doctorlist";
	    }
	    @RequestMapping("/edit/{id}")
		public ModelAndView showEditProductPage(@PathVariable(name = "id")int id)
		{
			ModelAndView mav = new ModelAndView("edit_doctor");
			Doctor doctor = service.get(id);
			mav.addObject("doctor",doctor);
			return mav;
		}
	    @RequestMapping("/delete/{id}")
		public String deleteproduct(@PathVariable(name="id")int id)
		{
			service.delete(id);
			return "redirect:/Admin/Doctorlist";
		}
}
