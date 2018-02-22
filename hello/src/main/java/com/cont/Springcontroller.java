package com.cont;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Springcontroller {
	
	@RequestMapping("/heloo")
	public ModelAndView sayhi()
	{
		
		System.out.println("hiii");
		
		String msg="rohini,,,helo dear";
		return ModelAndView("a","msg",msg);
		
	}

}
