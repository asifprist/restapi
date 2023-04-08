package com.consumeapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumeapi.service.Servicelayer;
import com.consumeapi.vo.User;

@RestController

public class Controllerapi {
	@Autowired
	private Servicelayer servicelayer;

	
	/*
	 * public Controllerapi(Servicelayer servicelayer) {
	 * this.servicelayer=servicelayer; }
	 */
	 
	
	@GetMapping("/hi")
	public ResponseEntity<User> getData() {
		return new ResponseEntity<User>(servicelayer.consumeAPI(),HttpStatus.OK);
	}

}
