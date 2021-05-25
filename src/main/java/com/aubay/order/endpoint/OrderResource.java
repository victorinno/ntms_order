package com.aubay.order.endpoint;

import com.aubay.order.entity.Order;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(path = "order")
public interface OrderResource extends PanacheEntityResource<Order, Long> {
}
