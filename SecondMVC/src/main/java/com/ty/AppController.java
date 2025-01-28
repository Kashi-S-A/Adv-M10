package com.ty;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	@RequestMapping("/msg")
	public String msg(Model model) {
		
		model.addAttribute("animal", "Tiger");
		model.addAttribute("mountain", 15000);
		model.addAttribute("King", "Shivaji");
		
		return "msg.jsp";
	}
	
	@RequestMapping("/demo")
	public ModelAndView data() {
		
		ModelAndView mv = new ModelAndView("data.jsp");
		mv.addObject("user", "Kashi");
		mv.addObject("umail", "kashi@gmail.com");
		mv.addObject("phone", 234567890);
		
		return mv;
	}
	
	@RequestMapping(value = "/read",method = RequestMethod.POST)
	public ModelAndView readData(HttpServletRequest request) {
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		
		//to print on the console
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		
		//to print using print.jsp page
		ModelAndView mv=new ModelAndView("print.jsp");
		mv.addObject("n", name);
		mv.addObject("e", email);
		mv.addObject("p", phone);
		
		return mv;
	}
}
