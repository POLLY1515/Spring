package br.com.poliana.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.poliana.Model.Greeting;

@RestController
public class GreetingController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong(); // como ainda nao estamos trabalhando com banco ,
	//usase esse id
	
	
	//http//localhost:8080/greeting?name=poliana
	@RequestMapping("/greeting")
	public Greeting greeting( @RequestParam(value = "name", defaultValue = "Word") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

}
