package com.luisow748.ExemploMensageria.messaging.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilaExemploConfig {

    private static final String NOME = "filaExemplo";
    public static final String FILA_EXEMPLO_QUEUE = NOME + "Queue";
    public static final String FILA_EXEMPLO_EXCHANGE = NOME + "Exchange";

    @Bean
    public Queue filaExemploQueue(){
        return new Queue(FILA_EXEMPLO_QUEUE, false);
    }

    @Bean
    FanoutExchange filaExemploExchange(){
        return ExchangeBuilder.fanoutExchange(FILA_EXEMPLO_EXCHANGE).build();
    }

    @Bean
    Binding filaExemploBinding(){
        return BindingBuilder.bind(
                this.filaExemploQueue())
                .to(this.filaExemploExchange());
    }
}
