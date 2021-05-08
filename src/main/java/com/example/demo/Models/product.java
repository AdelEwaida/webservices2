package com.example.demo.Models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table(name = "product")
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productNO;
    private String name;
    private int quantity;
    private String category;
    private int warehouseNO;


    public product() {
    }

    public product(int productNO, String name, int quantity, String category, int warehouseNO) {
        this.productNO = productNO;
        this.name = name;
        this.quantity = quantity;
        this.category = category;
        this.warehouseNO = warehouseNO;
    }

    public int getProductNO() {
        return productNO;
    }

    public void setProductNO(int productNO) {
        this.productNO = productNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getWarehouseNO() {
        return warehouseNO;
    }

    public void setWarehouseNO(int warehouseNO) {
        this.warehouseNO = warehouseNO;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNO=" + productNO +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                ", warehouseNO=" + warehouseNO +
                '}';
    }
}
