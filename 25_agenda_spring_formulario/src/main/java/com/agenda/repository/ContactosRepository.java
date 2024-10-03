package com.agenda.repository;

import java.util.List;

import com.agenda.model.Contacto;

public interface ContactosRepository {

	public void altaContacto(Contacto contacto);
	public Contacto recuperarContactoEmail(String email);
	public Contacto recuperarContactoId(int idContacto);
	public void eliminarContacto(int idContacto);
	List<Contacto> recuperarContactos();
	
}
  