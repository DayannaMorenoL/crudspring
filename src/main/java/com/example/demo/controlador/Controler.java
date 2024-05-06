package com.example.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfazServicio.InferfazClienteService;
import com.example.demo.modelo.Clientes;

@Controller
@RequestMapping
public class Controler {
	
	@Autowired
	private InferfazClienteService service;
	
	@GetMapping ("/listar")
	public String listar(Model model) {
		List<Clientes> cliente=service.listar();
		model.addAttribute("cliente", cliente);
		return "index";
	}
	
	@GetMapping ("/new")
	public String agregar(Model model) {
		model.addAttribute("cliente", new Clientes());
		return "formulario";
	}
	
	@PostMapping("/save")
	public String save (@Validated Clientes c, Model model) {
		service.save(c);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar (@PathVariable Integer id, Model model) {
		Optional<Clientes>cliente=service.listarId(id);
		model.addAttribute("cliente", cliente);
		return "formulario";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete (Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
}
