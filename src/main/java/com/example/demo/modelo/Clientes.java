package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="clientes_prueba")

public class Clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String apellidos_cliente;
	private String direccion_cliente;
	private String correo_cliente;
	private String nombres_cliente;
	private String telefono_cliente;
	
	public Clientes() {
		
	}

	public Clientes(int id, String apellidos_cliente, String direccion_cliente,
			String correo_cliente, String nombres_cliente, String telefono_cliente) {
		super();
		this.id = id;
		this.apellidos_cliente = apellidos_cliente;
		this.direccion_cliente = direccion_cliente;
		this.correo_cliente = correo_cliente;
		this.nombres_cliente = nombres_cliente;
		this.telefono_cliente = telefono_cliente;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellidos_cliente() {
		return apellidos_cliente;
	}

	public void setApellidos_cliente(String apellidos_cliente) {
		this.apellidos_cliente = apellidos_cliente;
	}

	public String getDireccion_cliente() {
		return direccion_cliente;
	}

	public void setDireccion_cliente(String direccion_cliente) {
		this.direccion_cliente = direccion_cliente;
	}

	public String getCorreo_cliente() {
		return correo_cliente;
	}

	public void setCorreo_cliente(String correo_cliente) {
		this.correo_cliente = correo_cliente;
	}

	public String getNombres_cliente() {
		return nombres_cliente;
	}

	public void setNombres_cliente(String nombres_cliente) {
		this.nombres_cliente = nombres_cliente;
	}

	public String getTelefono_cliente() {
		return telefono_cliente;
	}

	public void setTelefono_cliente(String telefono_cliente) {
		this.telefono_cliente = telefono_cliente;
	}

	
	
}
