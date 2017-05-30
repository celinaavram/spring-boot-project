package com.springbootbooksApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class index {
	 @RequestMapping("/")
	    String index(){
	        return "index";
	    }
}
