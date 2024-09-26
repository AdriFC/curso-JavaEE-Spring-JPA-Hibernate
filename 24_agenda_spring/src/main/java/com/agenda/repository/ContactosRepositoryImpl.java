package com.agenda.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.agenda.model.Contacto;

@Repository
public class ContactosRepositoryImpl implements ContactosRepository {

	@Autowired
	JdbcTemplate template;
	
	@Override
	public void altaContacto(Contacto contacto) {
		String sql = "insert into (nombre, email, telefono) values(?,?,?)";
		template.update(sql, contacto.getNombre(), contacto.getEmail(), contacto.getTelefono());
	}

	@Override
	public Contacto recuperarContactoEmail(String email) { 
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contacto recuperarContactoId(int idContacto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarContacto(int idContacto) {
		String sql = "delete from contactos where idContacto=?";
		template.update(sql, idContacto);
	}

	@Override
	public List<Contacto> recuperarContactos() {
		// TODO Auto-generated method stub
		return null;
	}

}
