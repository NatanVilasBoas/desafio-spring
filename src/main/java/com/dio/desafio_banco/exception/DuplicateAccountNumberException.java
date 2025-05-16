package com.dio.desafio_banco.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DuplicateAccountNumberException extends IllegalArgumentException{
    public DuplicateAccountNumberException(String message){
        super(message);
    }

}
