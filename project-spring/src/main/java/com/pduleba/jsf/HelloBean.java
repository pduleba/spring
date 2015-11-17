package com.pduleba.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import lombok.Data;

@ManagedBean
@SessionScoped
public @Data class HelloBean {

	private String name;
	
}
