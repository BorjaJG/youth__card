package com.youthcard.domain.models;

import java.util.Date;

public class Compra {

    private Integer id;
    private Date  dateOfPurchase;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
}