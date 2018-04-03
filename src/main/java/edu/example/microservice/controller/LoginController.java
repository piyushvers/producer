package edu.example.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.example.microservice.service.ILoginService;

@RestController
public class LoginController {
	
	@Autowired
	private ILoginService loginService;
	
	
//	public void setILoginService(ILoginService loginService) {
//		this.loginService = loginService;
//	}
	
	@RequestMapping("/validate")
	public String isAuthenticated(@RequestParam String name, @RequestParam String password) {
		String isValidated = loginService.validateCredentials(name, password);
		return isValidated;
	}
	
	@RequestMapping("/register")
	public String registration(@RequestParam String name, @RequestParam String password) {
		String isRegistered = loginService.register(name, password);
		return isRegistered;
	}
}
