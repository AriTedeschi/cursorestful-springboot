package com.example.cursorestful_springboot.Controllers;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController{

    public List<Cliente> clientes;

    @PostConstruct
    public void init(){
        Cliente c1  = new Cliente();

        c1.id       = 1;
        c1.nome     = "José";
        c1.endereco = "Rua x, 89";
        c1.saldo    = 202.0;

        Cliente c2  = new Cliente();
        
        c2.id       = 2;
        c2.nome     = "Maria";
        c2.endereco = "Rua y, 79";
        c2.saldo    = 444.0;

        clientes = Arrays.asList(c1,c2);
    }

    
    @GetMapping("/clientes")
    public List<Cliente> getClientes(){
        return clientes;
    }
    
    @GetMapping("/clientes/{id}")
    public Cliente getClienteByCodigo(@PathVariable int id){
        Cliente cliente = null;

        for (Cliente aux : clientes) {
            if(aux.id == id){
                cliente = aux;
                break;
            }
        }
        
        return cliente;
    }
}