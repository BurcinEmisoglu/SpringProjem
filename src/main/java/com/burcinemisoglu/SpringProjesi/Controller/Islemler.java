package com.burcinemisoglu.SpringProjesi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/islem")   //http://localhost:8080/islem
public class Islemler {

	@GetMapping("/topla/{s1}&{s2}")
	public String topla(@PathVariable int s1,@PathVariable int s2) {
		return "<h3>"+(s1+s2)+"</h3>";
		
	}
	@GetMapping("/cikar/{s1}&{s2}")
	public String cikar(@PathVariable int s1,@PathVariable int s2) {
		return "<h3>"+(s1-s2)+"</h3>";
		
	}
	@GetMapping("/carp/{s1}&{s2}")
	public String carp(@PathVariable int s1,@PathVariable int s2) {
		return "<h3>"+(s1*s2)+"</h3>";
		
	}
	@GetMapping("/bol/{s1}&{s2}")
	public String bol(@PathVariable int s1,@PathVariable int s2) {
		return "<h3>"+(s1/s2)+"</h3>";
		
	}

}
