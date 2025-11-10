package com.ajayfoods.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.ajayfoods.dto.OrderResponseDto;

@Service
public interface deliveryService {

	public ResponseEntity<OrderResponseDto> updateOrderStatus(long orderId, String status) ;

	public ResponseEntity<String> getRestaurentName(long restaurentId);
	

}
