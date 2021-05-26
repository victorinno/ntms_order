package com.aubay.order.command;

import java.io.Serializable;

public class StartOrderCommand implements Serializable {
    private String user;
    private String product;
    private Long quantity;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
