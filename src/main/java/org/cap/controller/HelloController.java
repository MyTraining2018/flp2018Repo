package org.cap.controller;

import javax.validation.Valid;

import org.cap.dao.PilotDao;
import org.cap.model.Pilot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@Autowired
	private PilotDao pilotDao;
	
	@RequestMapping("/hello")
	public ModelAndView greetUser() {
		return new ModelAndView
				("helloPage", "greetings", "Hello! Good Morning!");
	}
	
	
	@PostMapping("/validateLogin")
	public String validateLogin(ModelMap map, 
			@RequestParam("userName")String userName,
			@RequestParam("userPwd")String userPwd) {
		
		
		if(userName.equals("tom") && 
				userPwd.equals("tom123")) {
			map.put("pilot", new Pilot());
			return "pilotForm";
		}
		
		return "redirect:/";
	}
	
	//@RequestMapping(value="/savePilot",method=RequestMethod.POST)
	@PostMapping("/savePilot")
	public String showPilotDetails(
			@Valid @ModelAttribute("pilot") Pilot pilot,
			BindingResult result) {
		if(!result.hasErrors()) {
		System.out.println(pilot);
		pilotDao.save(pilot);
		return "showPilot";
		}
		return "pilotForm";
	}
	
}
