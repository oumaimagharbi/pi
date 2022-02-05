package tn.esprit.spring.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.domain.Message;
import tn.esprit.spring.service.MessageService;

@RestController
@RequestMapping(path = { "/", "/message"})
public class MessageResource {

	@Autowired
	MessageService msgService ;
	
	@GetMapping("/retrieve-all-messages")
	@ResponseBody
	public List<Message> getMessages() {
		List<Message> list = msgService.retrieveAllMessages();
		return list;
	}

	@GetMapping("/retrieve-message/{msg-id}")
	@ResponseBody
	public Message retrieveMessage(@PathVariable("msg-id") String id_msg) {
		return msgService.retrieveMessage(id_msg);
	}

	@PostMapping("/add-message")
	@ResponseBody
	public Message addMessage(@RequestBody Message m) {
		Message msg = msgService.addMessage(m);
		return msg;
	}

	@DeleteMapping("/remove-message/{msg-id}")
	@ResponseBody
	public void removeMessage(@PathVariable("msg-id") Long id_msg) {
		msgService.deleteMessage(id_msg);;
	}

	@PutMapping("/modify-message")
	@ResponseBody
	public Message modifyMessage(@RequestBody Message m) {
		return msgService.updateMessage(m);
	}
	
	@PutMapping("/add-user-a-message/{user-id}/{msg-id}")
	@ResponseBody
	public void affectUsertoMessage(@PathVariable("user-id") int id, @PathVariable("msg-id") int id_msg) {
		msgService.affectUserMessage(id, id_msg);
	}
}
