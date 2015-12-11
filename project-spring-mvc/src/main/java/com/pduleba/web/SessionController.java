package com.pduleba.web;


import static org.springframework.web.context.WebApplicationContext.SCOPE_SESSION;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pduleba.spring.dao.model.UserModel;
import com.pduleba.spring.service.LogService;
import com.pduleba.spring.service.TimeService;
import com.pduleba.spring.service.UserService;

import lombok.Data;

@Controller
@Scope(SCOPE_SESSION)
public @Data class SessionController implements Serializable {

	private static final long serialVersionUID = 1549481937223946546L;

	public static final Logger LOG = LoggerFactory.getLogger(SessionController.class);
	
	private String time;
	private List<UserModel> users = new ArrayList<>();
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private TimeService timeService;
	
	@Autowired
	private LogService logService;
	  
	@RequestMapping(value = {"/", "/welcome", "/views/welcome"}, method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		return "welcome";
	}
	
	@RequestMapping(value = "/create/user/{action}", method = RequestMethod.POST)
	public String createUser(@RequestParam("username") String name, @PathVariable("action") String action) {
		logService.logInfo("createUser :: starting...");
		setTime(timeService.getCurrentDateString());
		boolean success = userService.createUser(name);
		logService.logInfo("createUser :: complete");
		
		if (success) {
			LOG.info("User {} created!", name);
		} else {
			LOG.info("Unable to create user {}", name);
		}
		
		return "redirect:/";
	}
}
