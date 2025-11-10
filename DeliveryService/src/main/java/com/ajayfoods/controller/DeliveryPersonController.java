package com.ajayfoods.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ajayfoods.dto.OrderResponseDto;
import com.ajayfoods.service.deliveryService;

@RestController
public class DeliveryPersonController {
	private final deliveryService deliveryService;
	
	
	
	public DeliveryPersonController(com.ajayfoods.service.deliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}
	
	@PutMapping("/orderstatus/{orderId}")
	public ResponseEntity<OrderResponseDto> updateOrderStatus(@PathVariable(name = "orderId") long orderId,@RequestParam(name = "status") String status){
		return deliveryService.updateOrderStatus(orderId, status);
	}
	
	@GetMapping("/restaurantName/{restaurentId}")
	public ResponseEntity<String> getRestaurentName (@PathVariable (name = "restaurentId") long restaurentId){
		return deliveryService.getRestaurentName(restaurentId);
	}
	
	
	
	
	
}
