package com.phuongvatung.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phuongvatung.entities.OrderDetail;
import com.phuongvatung.repository.OrderDetailRepository;

@Service
public class OrderDetailService {

	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	public void saveOrder(OrderDetail orderDetail) {
		orderDetailRepository.save(orderDetail);
	}
	
}
