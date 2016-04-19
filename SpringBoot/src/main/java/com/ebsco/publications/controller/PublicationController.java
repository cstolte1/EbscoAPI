package com.ebsco.publications.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/topics")
public class PublicationController
{

	@RequestMapping("/search")
	@ResponseBody
	public String search()
	{
		return "no search here dude.";
	}
}
