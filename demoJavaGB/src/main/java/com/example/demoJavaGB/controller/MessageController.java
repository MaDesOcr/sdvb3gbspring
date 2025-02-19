package com.example.demoJavaGB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demoJavaGB.service.MessageService;

@Controller
public class MessageController {
	
	MessageService messageService;
	
	public MessageController(MessageService messageService) {
		this.messageService = messageService;
	}
	
	@GetMapping("/printMessage")
	public String printMessage(Model model) {
		model.addAttribute("listeMessages", messageService.getAllMessages());
		return "messagetemplate";
	}
	
	@PostMapping("/addMessage")
	public String getMessage(Model model, @RequestParam String name) {
		messageService.addMessage(name);
		System.out.println(messageService.getAllMessages());
		model.addAttribute("listeMessages", messageService.getAllMessages());
		return "messagetemplate";
	}
	
	//creer une classe Data qui va avoir une liste de string
	// pour stocker les infos envoyés. En respectant le role de service et de repo
	
	//afficher dans le template la liste enregistrée
	
}
