package com.example.cursorestful_springboot.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController{
    
    @GetMapping("/clientes")
    public String getClientes(){
        return "Retorno de todos os clientes";
    }
    
    @GetMapping("/clientes/{codigo}")
    public String getClienteByCodigo(@PathVariable int codigo){
        return "Retorna cliente de código="+codigo;
    }
}