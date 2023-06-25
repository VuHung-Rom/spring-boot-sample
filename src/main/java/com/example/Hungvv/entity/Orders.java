package com.example.Hungvv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Orders {
    @Id
    @Column()
    private int ordid;
    @Column
    private int customerid;
    @Column
    private int productid;
    @Column
    private Date orderdate;

    public int getOrdid() {
        return ordid;
    }

    public void setOrdid(int ordid) {
        this.ordid = ordid;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderDate(Date orderdate) {
        this.orderdate = orderdate;
    }
}
