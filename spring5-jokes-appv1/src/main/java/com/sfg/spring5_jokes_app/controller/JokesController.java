package com.sfg.spring5_jokes_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sfg.spring5_jokes_app.service.JokesService;

@Controller
public class JokesController {

	private final JokesService service;
	
	public JokesController(JokesService service) {
		this.service = service;
	}
	@RequestMapping({"/",""})
	public String showJoke(Model model) {
		model.addAttribute("joke",service.getJoke());
		return "index";
	}
}
