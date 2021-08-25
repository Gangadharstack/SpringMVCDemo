package com.ecomm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController
{
   @RequestMapping("/login")
   public String showLoginPage()
   {
	   System.out.println("Login Page");
	   return "Login";
   }
   
   @RequestMapping("/signup")
   public String showSignupPage()
   { 
	   System.out.println("Signup Page");
	   return "Register";
   }
}
