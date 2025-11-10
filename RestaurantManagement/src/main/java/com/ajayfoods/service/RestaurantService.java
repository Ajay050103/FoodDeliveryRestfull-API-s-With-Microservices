package com.ajayfoods.service;

import org.springframework.stereotype.Service;

import com.ajayfoods.dto.RestaurantCreationResponse;
import com.ajayfoods.dto.RestaurantRequestDto;
import com.ajayfoods.dto.RestaurantResponseDto;

@Service
public interface RestaurantService {

	public RestaurantCreationResponse addRestaurant(RestaurantRequestDto restaurantRequestDto) ;

	public RestaurantResponseDto getRestaurantById(long restaurantId);
		
	

}
