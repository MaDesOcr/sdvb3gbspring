package com.example.demoJavaGB.service;

import org.springframework.stereotype.Service;

import com.example.demoJavaGB.repository.HelloRepository;

@Service
public class HelloService {

	private HelloRepository helloRepository;

	public HelloService(HelloRepository helloRepository) {
		this.helloRepository = helloRepository;

	}
	public String returnHello() {
		return helloRepository.returnHello();
	}

}
