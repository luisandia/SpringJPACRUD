package com.factura.luis.JpaMvcSpring.models.dao;


import com.factura.luis.JpaMvcSpring.models.Entity.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface iClienteDao extends PagingAndSortingRepository<Cliente, Long>  {

}
