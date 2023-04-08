package com.consumeapi.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
	
	private int userId;
	private int id;
	private String title;
	
	@JsonProperty("completed")
	private boolean status;

}
