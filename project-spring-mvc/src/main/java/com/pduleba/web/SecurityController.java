package com.pduleba.web;


import static org.springframework.web.context.WebApplicationContext.SCOPE_REQUEST;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.Data;

@Controller
@Scope(SCOPE_REQUEST)
public @Data class SecurityController implements Serializable {

	private static final long serialVersionUID = 1549481937223946546L;

	public static final Logger LOG = LoggerFactory.getLogger(SecurityController.class);
	  
	@RequestMapping(value = "/security/denied", method = RequestMethod.POST)
	public String denied(ModelMap model) {
		LOG.info("DENIED");
		return "/security/denied";
	}	
	
	@RequestMapping(value = "/user/index", method = RequestMethod.POST)
	public String success(ModelMap model) {
		LOG.info("SUCCESS");
		return "redirect:/user/index";
	}
	
	@RequestMapping(value = "/security/error", method = RequestMethod.POST)
	public String error(ModelMap model) {
		LOG.info("ERROR");
		return "redirect:/security/error";
	}
	
	@RequestMapping(value = "/security/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
		LOG.info("LOGIN");
		return "/security/login";
	}
}
