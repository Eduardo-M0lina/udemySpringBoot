package com.backend.apirest.model.dao;

import com.backend.apirest.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Long> {
}
