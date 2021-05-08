package com.example.demo.Service;
import com.example.demo.Models.product;
import com.example.demo.Models.warehouse;
import com.example.demo.ProductNotFoundException;
import com.example.demo.Repository.warehouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class warehouseService {

    @Autowired
    warehouseRepo warehouserep;

    public warehouse newWareHouse(warehouse warehouse2){
        return warehouserep.save(warehouse2);
    }

    public List<warehouse> findAll(){
        return warehouserep.findAll();
    }
    public void deleteWareHouse(int id) {
        warehouserep.deleteById(id);
    }
    public warehouse findById(int id) {

        return warehouserep.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
    }

    public warehouse editWareHouse(warehouse newwarehouse, int id) {

        return warehouserep.findById(id)
                .map(warehouse -> {
                    warehouse.setAddress(newwarehouse.getAddress());
                    warehouse.setManager(newwarehouse.getManager());
                    warehouse.setWarehouseNO(newwarehouse.getWarehouseNO());
                    return warehouserep.save(warehouse);
                })
                .orElseGet(() -> {
                    newwarehouse.setWarehouseNO(id);
                    return warehouserep.save(newwarehouse);
                });
    }
}