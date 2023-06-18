package com.todo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class RequestController {
	
	/* one way of sending html to client is using thymeleaf and devtools dependency
	 * and and putting html file in src/main/resources/templates folder 
	 
	@RequestMapping(method=RequestMethod.GET  ,path="/")
	public String Home()
	{	
		return "home";
	}
*/
	@RequestMapping(method=RequestMethod.GET  ,path="/")
	public ModelAndView Home()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
		
	}
}
