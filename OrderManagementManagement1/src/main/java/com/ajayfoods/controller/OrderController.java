package com.ajayfoods.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ajayfoods.dto.OrderRequestDto;
import com.ajayfoods.dto.OrderResponseDto;
import com.ajayfoods.servics.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	private final OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@PostMapping("/placeorder")
	public ResponseEntity<OrderResponseDto> placeOrder (@RequestBody OrderRequestDto orderRequestDto){
		OrderResponseDto orderResponseDto = orderService.placeOrder(orderRequestDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(orderResponseDto);
	}
	
	@PutMapping("/orderstatus/{orderId}")
	public ResponseEntity<OrderResponseDto> updateOrderStatus(@PathVariable(name="orderId") long orderId,@RequestParam(name="status") String status){
		OrderResponseDto orderResponseDto = orderService.updateOrderStatus(orderId,status);
		return ResponseEntity.ok(orderResponseDto);
	}
	
	@GetMapping("/restaurentname/{restaurantId}")
	public ResponseEntity<String> getRestaurantName(@PathVariable(name="restaurantId") long restaurantId){
		String restaurantName = orderService.getRestaurantName(restaurantId);
		return ResponseEntity.ok(restaurantName);
	}
}
