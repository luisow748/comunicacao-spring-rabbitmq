package com.luisow748.ExemploMensageria.config;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.amqp.support.converter.SerializerMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class RabbitMQConfig {

    @Bean
    public MessageConverter serializerMessageConverter() {
        return new SerializerMessageConverter();
    }
}
