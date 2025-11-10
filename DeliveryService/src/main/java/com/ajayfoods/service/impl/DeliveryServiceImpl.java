package com.ajayfoods.service.impl;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ajayfoods.client.Restaurantclient;
import com.ajayfoods.dto.OrderResponseDto;
import com.ajayfoods.service.deliveryService;

@Service
public class DeliveryServiceImpl implements deliveryService{
	private final RestTemplate restTemplate;
	private final Restaurantclient restaurantclient; 
	

	public DeliveryServiceImpl(RestTemplate restTemplate ,Restaurantclient restaurantclient) {
		this.restTemplate = restTemplate;
		this.restaurantclient = restaurantclient;
	}


	@Override
	public ResponseEntity<OrderResponseDto> updateOrderStatus(long orderId, String status) {
		return restTemplate.exchange("http://localhost:9002/orderstatus/"+orderId+"?status="+status,HttpMethod.PUT,null,OrderResponseDto.class);
	}


	@Override
	public ResponseEntity<String> getRestaurentName(long restaurentId) {
		return restaurantclient.getRestaurantNameById(restaurentId) ;
	}
	
}
