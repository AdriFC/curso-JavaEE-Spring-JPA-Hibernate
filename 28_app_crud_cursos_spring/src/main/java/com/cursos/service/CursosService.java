package com.cursos.service;

import com.cursos.model.Curso;

public interface CursosService {

	void nuecoCurso(Curso curso);
	Curso buscarCurso(int idCurso);
	void actualizarCurso(Curso curso);
	void eliminarCurso(int idCurso);
		
}
