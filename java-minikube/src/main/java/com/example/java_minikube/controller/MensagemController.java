package com.example.java_minikube.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MensagemController {

    @GetMapping("/")
    public String getMensagem() {
        return "Olá! Sua API Java está rodando com Docker e Kubernetes.";
    }

    @GetMapping("/{nome}")
    public String getMensagemComNome(@PathVariable String nome) {
        return "Olá, " + nome + "!";
    }
}