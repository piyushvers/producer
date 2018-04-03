package edu.example.microservice.service;

public interface ILoginService {
	
	String validateCredentials(String name, String pass);
	
	String register(String name, String pass);

}
