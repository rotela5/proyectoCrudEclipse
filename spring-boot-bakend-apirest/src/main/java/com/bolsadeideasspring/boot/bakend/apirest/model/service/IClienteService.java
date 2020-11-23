package com.bolsadeideasspring.boot.bakend.apirest.model.service;

import java.util.List;

import com.bolsadeideasspring.boot.bakend.apirest.model.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
	public Cliente findById(Long Id);
	public Cliente save(Cliente cliente);
	public void delete(Long Id);

}
