package com.example.demo.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaz.InterfazCliente;
import com.example.demo.interfazServicio.InferfazClienteService;
import com.example.demo.modelo.Clientes;

@Service
public class ClientesService implements InferfazClienteService{
	
	@Autowired
	private InterfazCliente data;

	@Override
	public List<Clientes> listar() {
		return (List<Clientes>) data.findAll();
	}

	@Override
	public Optional<Clientes> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Clientes c) {
		int res=0;
		Clientes cliente=data.save(c);
		if(!cliente.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

}
