package com.rameshj.bookstore.orders.web;

import com.rameshj.bookstore.orders.ApplicationProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMQDemoController {
/*
    private final RabbitTemplate rabbitTemplate;

    private final ApplicationProperties properties;

    public RabbitMQDemoController(RabbitTemplate rabbitTemplate, ApplicationProperties properties) {
        this.rabbitTemplate = rabbitTemplate;
        this.properties = properties;
    }

    @PostMapping("/send")
    public void sendMessage(@RequestBody MyMessage message){
        rabbitTemplate.convertAndSend(properties.orderEventsExchange(),message.routingKey(),message.payload());
    }

    record MyMessage (String routingKey, PayLoad payload){}
    record PayLoad(String content){}
*/
}
