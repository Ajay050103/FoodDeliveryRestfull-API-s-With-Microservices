package com.ajayfoods.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.ajayfoods.dto.OrderItemRequestDto;
import com.ajayfoods.dto.OrderRequestDto;
import com.ajayfoods.model.Order;
import com.ajayfoods.model.OrderItem;

public class OrderBuilder {
	public static Order buildOrderFromOrderDto (OrderRequestDto orderRequestDto) {
		return Order.builder().status("Ordered")
					   .orderPrice(orderRequestDto.getOrderPrice())
					   .userId(orderRequestDto.getUserId())
					   .restaurantId(orderRequestDto.getRestaurantId())
					   .orderItems(buildOrderitemsFromOrderItemRequestDto(orderRequestDto.getOrderItems()))
					   .build();
	}
	
	private static List<OrderItem> buildOrderitemsFromOrderItemRequestDto (List<OrderItemRequestDto> OrderitemRequestDtos){
		List<OrderItem> orderItems = new ArrayList<>();
		for(OrderItemRequestDto itemRequestDtos:OrderitemRequestDtos) {
			OrderItem orderItem = new OrderItem();
			BeanUtils.copyProperties(itemRequestDtos, orderItem);
			orderItems.add(orderItem);
		}
		return orderItems;
	}
	

}
