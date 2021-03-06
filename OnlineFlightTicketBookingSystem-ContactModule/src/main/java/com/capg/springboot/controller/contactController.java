package com.capg.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.dto.contactDto;
import com.capg.springboot.entity.Contact;
import com.capg.springboot.service.contactService;

public class contactController {
	@Autowired
	private contactService contactservice;
	
	//Add contact method
	@PostMapping("/addContact")
	public ResponseEntity<Contact> addContact(@RequestBody contactDto Contact)
	{
		Contact contImpl=contactservice.addContact(Contact);
		return new ResponseEntity(contImpl,HttpStatus.OK);
	}
	//Modify contact method
		@PostMapping("/modifyContact")
		public ResponseEntity<Contact> modifyContact(@RequestBody contactDto Contact)
		{
			Contact contImpl=contactservice.modifycontact(Contact);
			return new ResponseEntity(contImpl,HttpStatus.OK);
		}
		
		//Deleting a contact
		@DeleteMapping("/deleteContact") 
		public ResponseEntity<Contact> removeContact(@RequestBody contactDto Contact)
		{
	       Contact custImpl=contactservice.removeCustomer(Contact);
	       return new ResponseEntity(custImpl,HttpStatus.OK); 
	    }
	

}
