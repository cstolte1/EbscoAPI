package com.ebsco.publications;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PublicationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublicationsApplication.class, args);
		
		/*
		 * Start an H2 web server so that we can inspect the database via a web interface:
		 * 
		 * http://localhost:8082/
		 */
		try {
			Server.createWebServer("-webAllowOthers","-webPort","8082").start();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
