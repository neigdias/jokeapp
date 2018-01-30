package com.br.nei.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.br.nei.services.JokeService;

/**
 * @author ngd on 30/01/2018
 */
@Controller
public class JokeController {

	private JokeService jokeService;

	@Autowired
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/", ""})
	public String showJoke(Model model){
		
		model.addAttribute("joke", jokeService.getJoke());
		
		return "chucknorris";
	}
}
