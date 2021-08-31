package com.assessment.springboot_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.springboot_model.Transport;
import com.assessment.springboot_repository.TransportRepo;

@RestController
@RequestMapping("/api/transport/")
public class TransportController {
	
	@Autowired
	private TransportRepo transRepo;
	
	@GetMapping("/allTransport/")
	public List<Transport> getAllTransports(){
		return transRepo.findAll();
	}

}
