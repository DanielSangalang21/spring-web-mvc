package com.dreamcatcher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dreamcatcher.implem.LogImplem;

@Controller
public class LogsController {
	
	@Autowired
	LogImplem logImplem;
	
	@CrossOrigin
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("ListOfLogs");
		mv.addObject("listLog", logImplem.getLogs());
		return mv;
	}
}
