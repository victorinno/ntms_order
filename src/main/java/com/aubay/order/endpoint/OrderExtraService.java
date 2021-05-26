package com.aubay.order.endpoint;

import com.aubay.order.api.Result;
import com.aubay.order.command.FinishOrderCommand;
import com.aubay.order.command.StartOrderCommand;
import com.aubay.order.entity.Order;
import com.aubay.order.entity.Status;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.time.LocalDateTime;

@Path("/order")
public class OrderExtraService {

    @Inject
    OrderResource resource;

    @POST
    @Transactional
    @Path("/start")
    @Consumes("application/json")
    @Produces("application/json")
    public Response start(StartOrderCommand command) {
        Order order = new Order();
        order.setOccurrence(LocalDateTime.now());
        order.user = command.getUser();
        order.product = command.getProduct();
        order.quantity = command.getQuantity();
        order.status = Status.PENDING;
        return Response.ok(resource.add(order).id).build();
    }

    @POST
    @Transactional
    @Path("/reject")
    @Consumes("application/json")
    @Produces("application/json")
    public Response reject(FinishOrderCommand command) {
        Order order = Order.findById(command.getId());
        order.status = Status.REJECTED;
        return Response.ok(new Result(true)).build();
    }

    @POST
    @Transactional
    @Path("/finish")
    @Consumes("application/json")
    @Produces("application/json")
    public Response finish(FinishOrderCommand command) {
        Order order = Order.findById(command.getId());
        order.status = Status.OK;
        return Response.ok(new Result(true)).build();
    }

}
