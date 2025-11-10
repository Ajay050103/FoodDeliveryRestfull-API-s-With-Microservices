package com.ajayfoods.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.ajayfoods.dto.OrderItemResponseDto;
import com.ajayfoods.dto.OrderResponseDto;
import com.ajayfoods.model.Order;
import com.ajayfoods.model.OrderItem;

public class OrderDtoBuilder {
	public static OrderResponseDto OrderResponseDtobuildOrderDtoFromOrder(Order order) {
		return OrderResponseDto.builder().orderId(order.getOrderId())
								  .status(order.getStatus())
								  .orderPrice(order.getOrderPrice())
								  .orderItems(buildOrderItemDtoFromOrderItem(order.getOrderItems()))
								  .build();
	}
	
	private static List<OrderItemResponseDto>  buildOrderItemDtoFromOrderItem(List<OrderItem>orderItems){
		List<OrderItemResponseDto> itemResponseDtos = new ArrayList<>();
		for(OrderItem orderItem :orderItems) {
			OrderItemResponseDto orderItemResponseDto = new  OrderItemResponseDto();
			BeanUtils.copyProperties(orderItem, orderItemResponseDto);
			itemResponseDtos.add(orderItemResponseDto);
		}
		return itemResponseDtos;
	}
	
}
