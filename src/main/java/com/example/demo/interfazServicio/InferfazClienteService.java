package com.example.demo.interfazServicio;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.Clientes;

public interface InferfazClienteService {
	
	public List<Clientes>listar();
	public Optional<Clientes>listarId(int id);
	public int save (Clientes c);
	public void delete (int id);

}
