package com.example.demo.Service;

import com.example.demo.Models.customer;
import com.example.demo.ProductNotFoundException;
import com.example.demo.Repository.customerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class customerService {

    @Autowired
    customerRepo customerrepo;


    public List<customer> findAllCustomers(){
        return customerrepo.findAll();
    }



    public customer findById(int id) {

        return customerrepo.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
    }


    public customer addcustomer(customer newcustomer){
        return customerrepo.save(newcustomer);

    }


    public void deletecustomer(int id) {
        customerrepo.deleteById(id);
    }


    public customer editcustomer(customer newcustomer, int id) {

        return customerrepo.findById(id)
                .map(customer -> {
                    customer.setCustomerNO(newcustomer.getCustomerNO());
                    customer.setCname(newcustomer.getCname());
                    customer.setCmobile(newcustomer.getCmobile());
                    customer.setCaddress(newcustomer.getCaddress());
                    customer.setCemail(newcustomer.getCemail());
                    return customerrepo.save(customer);
                })
                .orElseGet(() -> {
                    newcustomer.setCustomerNO(id);
                    return customerrepo.save(newcustomer);
                });
    }
}