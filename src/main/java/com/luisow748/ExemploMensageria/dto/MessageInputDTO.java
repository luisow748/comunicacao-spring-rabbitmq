package com.luisow748.ExemploMensageria.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class MessageInputDTO implements Serializable {
    private String message;
}
