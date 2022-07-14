package com.bloodbank.stock.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.bloodbank.stock.model.AuthenticationResponse;


/**
 *feign class to access authentication service methods
 */

@FeignClient(name = "auth-ms", url = "${feign.url-auth-service}")
public interface AuthFeignClient {

	/*
	 * feign method to validate token
	 */
	@GetMapping("/validateToken")
	public AuthenticationResponse getValidity(@RequestHeader("Authorization") String token);
	

	/*
	 * feign method to get role
	 */
	@GetMapping("/role/{id}")
	public String getRole(@PathVariable("id") String id);

}
