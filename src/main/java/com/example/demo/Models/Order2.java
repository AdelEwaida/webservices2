package com.example.demo.Models;


import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.lang.annotation.Target;
import java.util.ArrayList;
@Entity
public class Order2 {
    @Id
    @GeneratedValue
    private int orderID;
    private int productID ;
	private int customerNO;
    private int quantity ;

    public Order2(int orderID, int productID, int customerNO, int quantity) {
		this.orderID = orderID;
		this.productID = productID;
	    this.customerNO = customerNO;
		this.quantity = quantity;
	}


	public Order2() {
    }


	public int getOrderID() {
		return orderID;
	}


	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}


	public int getProductID() {
		return productID;
	}


	public void setProductID(int productID) {
		this.productID = productID;
	}


	public int getCustomerNO() {
		return customerNO;
	}


	public void setCustomerNO(int customerNO) {
		this.customerNO = customerNO;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}