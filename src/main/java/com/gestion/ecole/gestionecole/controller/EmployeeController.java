package com.gestion.ecole.gestionecole.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class EmployeeController {

	@GetMapping("/ping")
//	@PreAuthorize("hasRole('ADMIN')")
	private String ping() {
		return "ping=>pong";

	}
}
