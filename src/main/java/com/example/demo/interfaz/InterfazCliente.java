package com.example.demo.interfaz;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Clientes;

@Repository
public interface InterfazCliente extends CrudRepository<Clientes, Integer>{

}
