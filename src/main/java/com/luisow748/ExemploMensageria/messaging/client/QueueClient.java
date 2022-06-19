package com.luisow748.ExemploMensageria.messaging.client;

import com.luisow748.ExemploMensageria.dto.MessageInputDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

public interface QueueClient{

    default void createAndSend(MessageInputDTO input, String routingKey){
        getTemplate().convertAndSend(routingKey, input.getMessage());
    }

    RabbitTemplate getTemplate();

}
