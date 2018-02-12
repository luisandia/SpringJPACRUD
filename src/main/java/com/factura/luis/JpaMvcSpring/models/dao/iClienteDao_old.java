package com.factura.luis.JpaMvcSpring.models.dao;

import com.factura.luis.JpaMvcSpring.models.Entity.Cliente;

import java.util.List;

public interface iClienteDao_old {

    public List<Cliente> findAll();

    public void save(Cliente cliente);

    public Cliente findOne(Long id);

    public void delete(Long id);

}
