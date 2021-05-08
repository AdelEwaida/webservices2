package com.example.demo.Controller;

import com.example.demo.Models.customer;
import com.example.demo.Service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/customers")
public class customerController {
    @Autowired
    customerService customerservice;

    @GetMapping("/displayCustomers")
    public List<customer> getAll(){
        return customerservice.findAllCustomers();

    }

    @GetMapping("/find/{id}")
    customer one(@PathVariable int id) {
        return customerservice.findById(id);
    }


    @PostMapping("/addcustomer")
    public customer newcustomer(@RequestBody customer newcustomer) {
        return customerservice.addcustomer(newcustomer);
    }



    @DeleteMapping("/deletecustomer/{id}")
    void deletecustomer(@PathVariable int id) {
        customerservice.deletecustomer(id);
    }


    @PutMapping("/editcustomer/{id}")
    customer replacecustomer(@RequestBody customer newcustomer, @PathVariable int id) {
        return customerservice.editcustomer(newcustomer,id);
    }

}
