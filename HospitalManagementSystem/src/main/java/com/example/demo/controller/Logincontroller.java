package com.example.demo.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.model.Login;
import com.example.demo.service.Loginservice;

@Controller
public class Logincontroller {
	@Autowired
	private Loginservice userService;

	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("user", new Login());
		return mav;
	}

	@PostMapping("/login")
	public String login(@ModelAttribute("user") Login user, RedirectAttributes re) {

		Login oauthUser = userService.login(user.getUname(), user.getPassword(), user.getRole());
		String message = "Invalid Username or Password";
		System.out.print(user.getRole());
		System.out.print(oauthUser);
		if (Objects.nonNull(oauthUser)) {
			if (user.getRole().equals("Admin")) {

				return "redirect:/Admin/Home";
			} else if (user.getRole().equals("doctor")) {
				return "redirect:/Doctor/Home";
			} else {
				return "redirect:/Patient";
			}
		} else {
			re.addFlashAttribute("message", message);
			return "redirect:/login";

		}

	}

	@RequestMapping("/Logout")
	public String logoutDo(HttpServletRequest request, HttpServletResponse response) {

		return "redirect:/login";
	}

}
