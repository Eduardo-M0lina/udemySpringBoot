package com.backend.apirest.model.services;

import com.backend.apirest.model.entity.Cliente;

import java.util.List;

public interface ClienteService {

  public List<Cliente> findAll();
}
