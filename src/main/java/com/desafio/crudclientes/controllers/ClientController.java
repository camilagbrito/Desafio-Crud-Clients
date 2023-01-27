package com.desafio.crudclientes.controllers;

import com.desafio.crudclientes.dto.ClientDTO;
import com.desafio.crudclientes.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
    @Autowired
    private ClientService service;
    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id){
        return service.findById(id);
    }
   @GetMapping
    public Page<ClientDTO> findAll (Pageable pageable){
        return service.findAll(pageable);
    }

}
