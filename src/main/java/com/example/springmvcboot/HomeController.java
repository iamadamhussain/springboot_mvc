package com.example.springmvcboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
    String getHomePage(Model model){
		System.out.println("--------getHomePage------------------------");
		 model.addAttribute("helloWorld", new HelloWorld()); 
        return "home";
    }
	  @RequestMapping(value = "/sendmessage",method = RequestMethod.POST)
	    ModelAndView getsendMessage(@ModelAttribute("helloWorld") HelloWorld helloWorld){
		  
			System.out.println("--------getsendMessage------------------------"+helloWorld.toString());

	     String message=helloWorld.getMessage()+"---- welcome xworkz" ;
		  
		  ModelAndView modelAndView = new ModelAndView();
	        modelAndView.setViewName("success");
	        modelAndView.addObject("msg",message);
	     
	        return modelAndView;
	    }
}
