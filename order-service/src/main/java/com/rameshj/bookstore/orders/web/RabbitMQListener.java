package com.rameshj.bookstore.orders.web;

import org.springframework.stereotype.Service;

@Service
public class RabbitMQListener {
    /* @RabbitListener(queues = "${orders.new-orders-queue}")
    public void handleNewOrder(RabbitMQDemoController.PayLoad message){
        System.out.println("New order --> "+ message.content());
    }

    @RabbitListener(queues = "${orders.delivered-orders-queue}")
    public void handleDeliveredOrder(RabbitMQDemoController.PayLoad message){
        System.out.println("Delivered order --> "+ message.content());
    }
    */

}
