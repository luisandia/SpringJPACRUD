package com.factura.luis.JpaMvcSpring.models.dao;

import com.factura.luis.JpaMvcSpring.models.Entity.Cliente;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("clienteDaoJPA")
public class ClienteDaoImpl_old implements iClienteDao_old{

    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly=true)
    @Override
    public List<Cliente> findAll() {
        return em.createQuery("from Cliente").getResultList();
    }


    @Override
    public Cliente findOne(Long id) {
        return em.find(Cliente.class, id);
    }

    @Override
    public void save(Cliente cliente) {
        System.out.println("id"+cliente.getId());
        if(cliente.getId() != null && cliente.getId() >0) {
            System.out.println("actualizo"+cliente.getId());
            em.merge(cliente);
        } else {
            em.persist(cliente);
        }
    }


    @Override
    public void delete(Long id) {
        em.remove(findOne(id));
    }


}
