package com.example.demo.Controller;

import com.example.demo.Models.product;
import com.example.demo.Service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/products")
public class productController {
    @Autowired
    productService productService;

    @GetMapping("/displayProducts")
    public List<product> getAll(){
        return productService.findAllProducts();

    }



    @GetMapping("/find/{id}")
    product one(@PathVariable int id) {
        return productService.findById(id);
    }


    @PostMapping("/addProduct")
    public product newProduct(@RequestBody product newproduct) {
        return productService.addProduct(newproduct);
    }



    @DeleteMapping("/deleteProduct/{id}")
    void deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
    }


    @PutMapping("/editProduct/{id}")
    product replaceProduct(@RequestBody product newProduct, @PathVariable int id) {
        return productService.editProduct(newProduct,id);
    }

}
