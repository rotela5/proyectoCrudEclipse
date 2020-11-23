package com.bolsadeideasspring.boot.bakend.apirest.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideasspring.boot.bakend.apirest.model.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
