package com.cursos.service;

import java.util.List;

import com.cursos.model.Alumno;

public interface AlumnosService {
	List<Alumno> alumnosCurso(int idCurso);
}
