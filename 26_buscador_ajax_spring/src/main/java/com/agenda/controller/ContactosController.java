package com.agenda.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.agenda.model.Contacto;
import com.agenda.service.ContactosService;

@Controller
public class ContactosController {
	
	@Autowired
	ContactosService service;
	
	@GetMapping("paginaAlta")
	public String preAlta(Model model) {
		//Creamos el objecto contacto y lo almacenamos como Modl Attribute
		//para que spring guarde en el los parámetros de la petición.
		Contacto contacto = new Contacto();
		model.addAttribute("contacto", contacto);
		return "datos";
	}
	
	@PostMapping("alta")
	public String nuevoContacto(@ModelAttribute("contacto")Contacto contacto){
		
		if (!service.nuevoContacto(contacto)) {
			return "repetido";
		}
		return "inicio";
	}
	
	@GetMapping(value="recuperar")
	public String recuperarContactos(HttpServletRequest request){
		request.setAttribute("contactos", service.obtenerContactos());
		return "contactos";
	}
	
	@GetMapping(value="eliminar")
	public String eliminarContacto(@RequestParam("idContacto") int idContacto){
		if (!service.eliminarContacto(idContacto)) {
			return "noexistente";
		}		
		return "forward:/recuperar";
	}
	
	@GetMapping(value="buscar",produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Contacto> buscarContactos(@RequestParam("nom") String nom){
		
		return service.buscarContactos(nom);
	}
	
}
