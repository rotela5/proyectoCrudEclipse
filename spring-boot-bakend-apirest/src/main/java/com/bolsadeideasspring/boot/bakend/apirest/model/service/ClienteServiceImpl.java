package com.bolsadeideasspring.boot.bakend.apirest.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideasspring.boot.bakend.apirest.model.dao.IClienteDao;
import com.bolsadeideasspring.boot.bakend.apirest.model.entity.Cliente;
@Service
public class ClienteServiceImpl implements IClienteService {
    @Autowired
    private IClienteDao clienteDao;
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		
		return (List<Cliente>) clienteDao.findAll() ;
	}
	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long Id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(Id).orElse(null);
	}
	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}
	@Override
	@Transactional
	public void delete(Long Id) {
		// TODO Auto-generated method stub
		clienteDao.deleteById(Id);
	}

}
