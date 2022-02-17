package com.first.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AppController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!!!";
    }

    @GetMapping("/mentalidades")
    public String mentalidades() {
        return "Para realizar esta atividade tive que usa a persistência e orientação ao detalhe.";
    }

    @GetMapping("/objetivos")
    public String objetivos() {
        return "Essa semana meus objetivos são: me aprimorar em MySql, avançar em spring e fazer a conexão com o banco de dados";
    }
}