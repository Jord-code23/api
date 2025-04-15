package br.com.projeto.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.modelo.Cliente;
import br.com.projeto.api.repositorio.Repositorio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Controller {
    
    @Autowired
    private Repositorio act;

    @PostMapping("/")
    public Cliente cadastrar(@RequestBody Cliente c){
        return act.save(c);
    }

    @GetMapping("/")
    public String teste() {
        return "Hello World";
    }
    

}
