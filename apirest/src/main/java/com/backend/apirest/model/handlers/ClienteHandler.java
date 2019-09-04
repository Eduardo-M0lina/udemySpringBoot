package com.backend.apirest.model.handlers;

import com.backend.apirest.model.dao.ClienteDao;
import com.backend.apirest.model.entity.Cliente;
import com.backend.apirest.model.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteHandler implements ClienteService {

  @Autowired//inyeccion de dependencia, crea la instancia de la clase
  private ClienteDao clienteDao;

  @Override
  @Transactional(readOnly = true)//Puedo omitir si no es un metodo propio.
  public List<Cliente> findAll() {
    return (List<Cliente>) clienteDao.findAll();
  }
}
