package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//request mapping : type 단독
@Controller
@RequestMapping("/guestbook/*")
public class GuestBookControlloer {
	
	public void commonFunction() {
		
	}
	@ResponseBody
	@RequestMapping	
	public String list() {
		return "GuestbookController:list()";
	}
	
	@ResponseBody
	@RequestMapping	
	public String delete() {
		return "GuestbookController:delete()";
	}
}
