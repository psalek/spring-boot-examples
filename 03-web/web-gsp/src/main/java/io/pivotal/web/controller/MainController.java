package io.pivotal.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import io.pivotal.web.domain.Marketing;

@RestController
public class MainController {

	@RequestMapping("/")
	public ModelAndView home(){
		
		@SuppressWarnings("serial")
		List<Marketing> offers = new ArrayList<Marketing>() {{ 
			add(new Marketing("Pricing","Easy Payments! Only $1 at month with 500 code snippets."));
			add(new Marketing("GitHub Gists","Easy Integration with GitHub Gists. Share with everybody!"));
			
			add(new Marketing("REST API","Powerful REST API to manage your Code Snippets in your own Programming Language"));
			add(new Marketing("OAuth Security","Keep you Code Snippets secured with Authentication and Authorization based on OAuth."));
		}};
		
		
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("today", new Date());
		model.put("offers", offers);
		
		
		return new ModelAndView("views/home",model);
	}
	
}

