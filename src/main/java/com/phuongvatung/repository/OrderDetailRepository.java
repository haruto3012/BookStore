package com.phuongvatung.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phuongvatung.entities.OrderDetail;
@Repository
public interface OrderDetailRepository  extends JpaRepository<OrderDetail, Integer>{

}
