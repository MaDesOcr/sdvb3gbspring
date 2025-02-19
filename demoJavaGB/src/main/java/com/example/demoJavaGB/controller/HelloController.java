package com.example.demoJavaGB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoJavaGB.service.HelloService;

@RestController
public class HelloController {

	/*@Autowired*/ //ancienne version de l'injection de dependences
	HelloService helloService;

	public HelloController(HelloService helloService) {
		this.helloService = helloService;
	}

	@GetMapping("/hello")
	public String getHello() {
		return helloService.returnHello();
	}

	@PostMapping("/hello")
	public String getHelloWithName(@RequestParam String name) {
		return helloService.returnHello().concat(name);
	}


}
