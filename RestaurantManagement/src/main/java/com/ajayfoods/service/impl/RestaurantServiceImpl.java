package com.ajayfoods.service.impl;
import org.springframework.stereotype.Service;
import com.ajayfoods.builder.RestaurantBuilder;
import com.ajayfoods.builder.RestaurantDtoBuilder;
import com.ajayfoods.dao.RestaurantRepository;
import com.ajayfoods.dto.RestaurantCreationResponse;
import com.ajayfoods.dto.RestaurantRequestDto;
import com.ajayfoods.dto.RestaurantResponseDto;
import com.ajayfoods.model.Restaurant;
import com.ajayfoods.service.RestaurantService;
@Service
public class RestaurantServiceImpl implements RestaurantService{
	
	private final RestaurantRepository  restaurantRepository;

	public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
		this.restaurantRepository = restaurantRepository;
	}

	@Override
	public RestaurantCreationResponse addRestaurant(RestaurantRequestDto restaurantRequestDto) {
		Restaurant restaurant = RestaurantBuilder.buuildrestaurentFromRestaurantDto(restaurantRequestDto);
		Restaurant savedRestaurant = restaurantRepository.save(restaurant);
		return new RestaurantCreationResponse(savedRestaurant.getRestaurantId(), savedRestaurant.getRestaurantName());
	}

	@Override
	public RestaurantResponseDto getRestaurantById(long restaurantId) {
		Restaurant restaurant = restaurantRepository.findById(restaurantId)
							.orElseThrow(()->new IllegalArgumentException("No restaurant found with Id : "+restaurantId));
		RestaurantResponseDto restaurantResponseDto = RestaurantDtoBuilder.buildRestaurantDtoFromRestaurant(restaurant);
		return restaurantResponseDto;
	}

}
