package com.demo.Controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.Model.Korisnik;

public class HomeController {
	 @Autowired
	    private Korisnik userRepo;
	     
	    @GetMapping("")
	    public String viewHomePage() {
	        return "index";
	    }
}
