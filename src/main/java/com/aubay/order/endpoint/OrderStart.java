package com.aubay.order.endpoint;

import com.aubay.order.entity.Order;
import com.aubay.order.entity.Status;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/order/start")
public class OrderStart {

    @Inject
    OrderResource resource;

    @Transactional
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response start(Order order) {
        order.status = Status.PENDING;
        return Response.ok(resource.add(order)).build();
    }

}
