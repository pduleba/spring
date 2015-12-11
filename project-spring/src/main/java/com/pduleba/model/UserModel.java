package com.pduleba.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class UserModel {

	@NotNull
	private String name;
	
	@NotNull
	private String surname;
	
	@Min(0)
	private int age;
}
