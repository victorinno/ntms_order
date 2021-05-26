package com.aubay.order.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Optional;

@Entity
@Table(name = "order_table")
public class Order extends PanacheEntity {

    public String user;
    public String product;
    public Long quantity;
    public LocalDateTime occurrence;
    public Status status;

    public LocalDateTime getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(LocalDateTime occurrence) {
        this.occurrence = Optional.ofNullable(occurrence).orElse(LocalDateTime.now());
    }
}
