package com.example.demoJavaGB.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demoJavaGB.model.Message;
import com.example.demoJavaGB.repository.MessageRepository;

@Service
public class MessageService {

	MessageRepository messageRepository;
	
	public MessageService(MessageRepository messageRepository) {
		this.messageRepository = messageRepository;
	}
	
	public void addMessage(Message m) {
		messageRepository.save(m);
	}
	
	public ArrayList<Message> getAllMessages(){
		return (ArrayList<Message>) messageRepository.findAll();
	}
}
