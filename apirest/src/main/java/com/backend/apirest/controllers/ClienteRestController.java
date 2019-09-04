package com.backend.apirest.controllers;

import com.backend.apirest.model.entity.Cliente;
import com.backend.apirest.model.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteRestController {

  @Autowired
  private ClienteService clienteService;

  public List<Cliente> findAll() {
    return clienteService.findAll();
  }
}
