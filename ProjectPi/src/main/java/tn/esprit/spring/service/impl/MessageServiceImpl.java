package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.domain.Message;
import tn.esprit.spring.domain.User;
import tn.esprit.spring.repository.MessageRepository;
import tn.esprit.spring.repository.UserRepository;
import tn.esprit.spring.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService{
	
	@Autowired
	MessageRepository mrep ;
	
	@Autowired
	UserRepository urep ;

	@Override
	public List<Message> retrieveAllMessages() {
		// TODO Auto-generated method stub
		return (List<Message>) mrep.findAll();
	}

	@Override
	public Message addMessage(Message m) {
		// TODO Auto-generated method stub
		return mrep.save(m);
	}

	@Override
	public void deleteMessage(Long id_msg) {
		// TODO Auto-generated method stub
		mrep.deleteById((long) id_msg);
	}

	@Override
	public Message updateMessage(Message m) {
		// TODO Auto-generated method stub
		return mrep.save(m);
	}

	@Override
	public Message retrieveMessage(String id_msg) {
		// TODO Auto-generated method stub
		return mrep.findById(Long.parseLong(id_msg)).orElse(null);
	}

	@Override
	public void affectUserMessage(long id, long id_msg) {
		// TODO Auto-generated method stub
		User user = urep.findById((long) id).orElse(null);
		Message message = mrep.findById((long) id_msg).orElse(null);
		message.setUser(user);
		mrep.save(message);
	}

}
