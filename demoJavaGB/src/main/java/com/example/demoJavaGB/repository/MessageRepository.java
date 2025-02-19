package com.example.demoJavaGB.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoJavaGB.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer>{

	
	/*
	public void addMessage(Message m) {
		Data.alMessage.add(m);
	}
	
	public ArrayList<Message> getAllMessages(){
		return Data.alMessage;
	}
	*/
}
