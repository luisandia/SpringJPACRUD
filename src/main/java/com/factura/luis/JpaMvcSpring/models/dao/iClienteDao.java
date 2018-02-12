package com.factura.luis.JpaMvcSpring.models.dao;

import com.factura.luis.JpaMvcSpring.models.Entity.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface iClienteDao extends CrudRepository<Cliente, Long> {

}
