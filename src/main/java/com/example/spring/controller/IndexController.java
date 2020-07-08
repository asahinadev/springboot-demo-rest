package com.example.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
public class IndexController {

	@GetMapping
	public Mono<Map<String, String>> doGet() {
		Map<String, String> result = new HashMap<>();
		result.put("status", "OK");
		return Mono.create(e -> e.success(result));
	}

}
