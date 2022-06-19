package com.luisow748.ExemploMensageria.events;

import com.luisow748.ExemploMensageria.dto.MessageInputDTO;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class FilaExemploEvent extends ApplicationEvent {

    @Getter
    private final MessageInputDTO input;

    public FilaExemploEvent(Object source, MessageInputDTO input) {
        super(source);
        this.input = input;
    }
}
