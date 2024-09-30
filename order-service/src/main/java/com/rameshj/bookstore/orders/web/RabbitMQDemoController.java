package com.rameshj.bookstore.orders.web;

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
