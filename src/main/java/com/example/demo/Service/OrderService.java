package com.example.demo.Service;

import com.example.demo.Models.Order2;
import com.example.demo.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

	@Autowired
	OrderRepo orderrepo;

	public Order2 newOrder(Order2 order2){


		return orderrepo.save(order2);

	}

	public List<Order2> findAll(){
		return orderrepo.findAll();
	}

	public Optional<Order2> findById(Integer orderID) {
		return orderrepo.findById(orderID);	
	}
}