package com.example.demoJavaGB.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.demoJavaGB.data.Data;

@Repository
public class MessageRepository {

	public void addMessage(String s) {
		Data.alMessage.add(s);
	}
	
	public ArrayList<String> getAllMessages(){
		return Data.alMessage;
	}
	
}
