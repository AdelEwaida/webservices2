package com.example.demo.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class warehouse {
    @Id
    @GeneratedValue
        private int warehouseNO;
    private String address;
    private String manager;

    public warehouse(int warehouseNO, String address, String manager) {
        this.warehouseNO = warehouseNO;
        this.address = address;
        this.manager = manager;
    }

    public warehouse() {

    }

    public int getWarehouseNO() {
        return warehouseNO;
    }

    public void setWarehouseNO(int warehouseNO) {
        this.warehouseNO = warehouseNO;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}