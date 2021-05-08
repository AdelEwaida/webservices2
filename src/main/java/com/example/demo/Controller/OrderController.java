package com.example.demo.Controller;


import com.example.demo.Models.Order2;
import com.example.demo.Repository.OrderRepo;
import com.example.demo.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	OrderService orderservice;

	public OrderController(OrderRepo orderrepo) {}

	@PostMapping("/neworder")
	public Order2 newOrder(@RequestBody Order2 order){
		return orderservice.newOrder(order);
	}

	@GetMapping("/vieworders")
	public List<Order2> getAll(){
		return orderservice.findAll();
	}
	@GetMapping("/orders/{id}")
	public Optional<Order2> one(@PathVariable Integer orderID) {
		
		return orderservice.findById(orderID);
	}

}
