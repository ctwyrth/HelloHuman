package com.ctwyrth.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required = false) String name, String last_name, Integer times) {
		if (name == null && last_name == null && times == null) {
			return "HUMAN";
		} else if (name == null && last_name == null && times > 0) { 
			String humanTimes = new String();
			for (int i = 0; i < times; i++) {
				humanTimes += "HUMAN ";
			}
			return humanTimes;
		} else if (name != "" && last_name == null) {
			return "Welcome to the site, " + name + "!";
		} else if (name != "" && last_name != "") {
			return "Welcome to the site, " + name + " " + last_name + "!";
		}
		return "Poo";
	}
	
}
