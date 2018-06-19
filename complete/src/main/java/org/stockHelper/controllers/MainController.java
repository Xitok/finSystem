package org.stockHelper.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.stockHelper.repositories.ClientRepository;

@RestController
public class MainController {
	@Autowired
	private ClientRepository clientRepository;

}
