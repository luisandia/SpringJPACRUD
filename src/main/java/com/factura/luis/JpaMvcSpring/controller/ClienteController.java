package com.factura.luis.JpaMvcSpring.controller;

import com.factura.luis.JpaMvcSpring.models.dao.iClienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClienteController {

    @Autowired
    @Qualifier("clienteDaoJPA")
    private iClienteDao clienteDao;

    @RequestMapping(value="listar",method= RequestMethod.GET)
    public String listar(Model model){
        model.addAttribute("titulo","listado de clientes");
        model.addAttribute("clientes",clienteDao.findAll());

        return "listar";
    }

}
