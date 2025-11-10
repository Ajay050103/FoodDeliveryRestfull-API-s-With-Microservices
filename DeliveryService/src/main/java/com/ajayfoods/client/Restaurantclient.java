package com.ajayfoods.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "RestaurantManagement")
public interface Restaurantclient {
	
	@GetMapping("restaurant/name/{restaunantId}")
	public ResponseEntity<String> getRestaurantNameById(@PathVariable(name="restaunantId") long restaurantId);
		
}
