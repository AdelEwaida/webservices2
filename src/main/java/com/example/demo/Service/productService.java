package com.example.demo.Service;

import com.example.demo.Models.product;
import com.example.demo.ProductNotFoundException;
import com.example.demo.Repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class productService {

    @Autowired
    productRepository productRepository;


    public List<product> findAllProducts(){
        return productRepository.findAll();
    }



    public product findById(int id) {

        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
    }


    public product addProduct(product newProduct){
        return productRepository.save(newProduct);

    }


    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }


    public product editProduct(product newProduct, int id) {

        return productRepository.findById(id)
                .map(product -> {
                    product.setName(newProduct.getName());
                    product.setQuantity(newProduct.getQuantity());
                    product.setCategory(newProduct.getCategory());
                    product.setWarehouseNO(newProduct.getWarehouseNO());
                    return productRepository.save(product);
                })
                .orElseGet(() -> {
                    newProduct.setProductNO(id);
                    return productRepository.save(newProduct);
                });
    }
}