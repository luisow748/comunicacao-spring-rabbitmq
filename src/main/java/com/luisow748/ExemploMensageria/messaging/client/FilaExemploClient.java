package com.luisow748.ExemploMensageria.messaging.client;

import com.luisow748.ExemploMensageria.events.FilaExemploEvent;
import com.luisow748.ExemploMensageria.messaging.config.FilaExemploConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@DependsOn("filaExemploQueue")
public class FilaExemploClient implements QueueClient{

    private final RabbitTemplate rabbitTemplate;

    @EventListener
    public void filaExemploEvent(FilaExemploEvent filaExemploEvent){
        createAndSend(filaExemploEvent.getInput(), FilaExemploConfig.FILA_EXEMPLO_QUEUE);
    }

    @Override
    public RabbitTemplate getTemplate() {
        return this.rabbitTemplate;
    }
}
