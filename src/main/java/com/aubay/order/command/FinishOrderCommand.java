package com.aubay.order.command;

import java.io.Serializable;

public class FinishOrderCommand implements Serializable {

    private Long id;

    public FinishOrderCommand() {
    }

    public FinishOrderCommand(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
