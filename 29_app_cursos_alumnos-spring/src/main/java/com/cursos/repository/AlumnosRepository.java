package com.cursos.repository;

import java.util.List;

import com.cursos.model.Alumno;

public interface AlumnosRepository {
	List<Alumno> alumnosCurso(int idCurso);
}
