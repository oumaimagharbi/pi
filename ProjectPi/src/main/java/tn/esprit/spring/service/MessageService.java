package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.domain.Message;

public interface MessageService {

	List<Message> retrieveAllMessages();

	Message addMessage(Message m);

	void deleteMessage(Long id_msg);

	Message updateMessage(Message m);

	Message retrieveMessage(String id_msg);
	
	public void affectUserMessage(long id, long id_msg);
}
