package com.dominiomondi.EntradaDados.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dominiomondi.EntradaDados.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UseResource {
	
	@GetMapping
	public ResponseEntity<User> finAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "999999999", "123456");
		return ResponseEntity.ok().body(u);
	}
	

}
