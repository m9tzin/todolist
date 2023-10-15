package br.com.m9tzin.todolist.controller;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstRoute") /* Estruturar a rota */
public class MyFirstController {

/**
 * Métodos de acesso do HTTP
 * GET - Buscar uma informação
 * POST - Adicionar um dado
 * PUT - Alterar um dado/info
 * DELETE - Remover um dado
 * PATCH - Alterar somente uma parte
 * 
*/
    @GetMapping("/firstMethod")
    public String firstMessage(){
        return "Feito!";
    }
}
