package com.luisow748.ExemploMensageria.service;

import com.luisow748.ExemploMensageria.dto.MessageInputDTO;
import com.luisow748.ExemploMensageria.events.FilaExemploEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessagingService {

    private final ApplicationEventPublisher applicationEventPublisher;

    public String IniciarFilaExemploEvent(MessageInputDTO input) {
        FilaExemploEvent filaExemploEvent = new FilaExemploEvent(this, input);
        applicationEventPublisher.publishEvent(filaExemploEvent);
        return "Mensagem encaminhada para a fila. " + input.getMessage();
    }
}
