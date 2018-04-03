package edu.example.microservice.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService implements ILoginService{

	public String validateCredentials(String name, String pass) {
		return "Y";
	}

	public String register(String name, String pass) {
		return "Y";
	}

}
