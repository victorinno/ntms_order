package com.aubay.order.command;

import java.io.Serializable;

public class RejectOrderCommand implements Serializable {

    private Long id;

    public RejectOrderCommand() {
    }

    public RejectOrderCommand(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
