package com.example.demoJavaGB.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demoJavaGB.repository.MessageRepository;

@Service
public class MessageService {

	MessageRepository messageRepository;
	
	public MessageService(MessageRepository messageRepository) {
		this.messageRepository = messageRepository;
	}
	
	public void addMessage(String s) {
		messageRepository.addMessage(s);
	}
	
	public ArrayList<String> getAllMessages(){
		return messageRepository.getAllMessages();
	}
}
