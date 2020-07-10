package com.mycomp.configuration;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.mycomp.controller.UserController;

@Component
@ApplicationPath("/app/v1")
public class JerseyConfig extends ResourceConfig {

	
	public JerseyConfig(){
		//register all the Endpoint here 
		register(UserController.class);
	}
}
