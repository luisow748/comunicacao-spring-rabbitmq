package com.luisow748.ExemploMensageria.controller;

import com.luisow748.ExemploMensageria.dto.MessageInputDTO;
import com.luisow748.ExemploMensageria.service.MessagingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessagingController {

    private final MessagingService messagingService;

    @PostMapping("/filaExemplo")
    public String filaExemplo(MessageInputDTO messageInput){
        return messagingService.IniciarFilaExemploEvent(messageInput);
    }
}
