package com.example.demo.Models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table(name = "customer")
public class customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerNO;
    private String cname;
    private String cmobile;
    private String cemail;
    private String caddress;


    public customer(int customerNO, String cname, String cmobile, String cemail, String caddress) {
        this.customerNO = customerNO;
        this.cname = cname;
        this.cmobile = cmobile;
        this.cemail = cemail;
        this.caddress = caddress;
    }

    public customer() {

    }

    public int getCustomerNO() {
        return customerNO;
    }

    public void setCustomerNO(int customerNO) {
        this.customerNO = customerNO;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCmobile() {
        return cmobile;
    }

    public void setCmobile(String cmobile) {
        this.cmobile = cmobile;
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    @Override
    public String toString() {
        return "customer{" +
                "customerNO=" + customerNO +
                ", cname='" + cname + '\'' +
                ", cmobile='" + cmobile + '\'' +
                ", cemail='" + cemail + '\'' +
                ", caddress='" + caddress + '\'' +
                '}';
    }
}