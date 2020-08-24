package com.example.cursorestful_springboot.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController{
    
    @GetMapping("/cliente")
    public String getClientes(){
        return "Retorno d todos os clientes";
    }
    
    @GetMapping("/cliente/{codigo}")
    public String getClienteByCodigo(@PathVariable int codigo){
        return "Retorna cliente de código="+codigo;
    }
}