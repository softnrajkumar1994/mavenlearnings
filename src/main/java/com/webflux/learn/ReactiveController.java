package com.webflux.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class ReactiveController {

	@Autowired
	private ReactiveRedisConnectionFactory factory;

	@GetMapping("/")
	public Mono<String> getName() {
		return Mono.just("raj");
	}

}
