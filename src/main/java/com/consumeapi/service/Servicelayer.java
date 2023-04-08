package com.consumeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consumeapi.vo.User;

@Service
public class Servicelayer {
	@Autowired
	private  RestTemplate restTemplate;
	
	
	/*
	 * public Servicelayer(RestTemplate restTemplate) {
	 * this.restTemplate=restTemplate; }
	 */
	
	public User consumeAPI() {
		return restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1", User.class);
	}

}
