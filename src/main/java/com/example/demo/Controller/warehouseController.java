package com.example.demo.Controller;

import com.example.demo.Models.warehouse;
import com.example.demo.Service.warehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/warehouses")
public class warehouseController {
    @Autowired
    warehouseService warehousesercvice;

    @GetMapping("/displaywarehouse")
    public List<warehouse> getAll(){
        return warehousesercvice.findAll();

    }

    @GetMapping("/find/{id}")
    warehouse one(@PathVariable int id) {
        return warehousesercvice.findById(id);
    }


    @PostMapping("/addwarehouse")
    public warehouse newProduct(@RequestBody warehouse newwarehouse) {
        return warehousesercvice.newWareHouse(newwarehouse);
    }



    @DeleteMapping("/deletewarehouse/{id}")
    void deleteProduct(@PathVariable int id) {
        warehousesercvice.deleteWareHouse(id);
    }


    @PutMapping("/editwarehouse/{id}")
    warehouse replaceProduct(@RequestBody warehouse newwarehouse, @PathVariable int id) {
        return warehousesercvice.editWareHouse(newwarehouse,id);
    }

}
