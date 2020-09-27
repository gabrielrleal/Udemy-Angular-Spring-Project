package io.github.gabrielrleal.clientes.rest.exception;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public class ApiErrors {
    @Getter
    private List<String> errors;

    public ApiErrors(List<String>errors){
        this.errors = errors;
    }
    //construtor que recebe só uma mensagem e transforma num array de erros
    public ApiErrors(String message){
        this.errors = Arrays.asList(message);
    }

}
