package com.cursos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursos.model.Alumno;
import com.cursos.repository.AlumnosRepository;
import com.cursos.repository.CursosRepository;

@Service
public class AlumnosServiceImpl implements AlumnosService {
	@Autowired
	AlumnosRepository alumnosRepository;
	@Autowired
	CursosRepository cursosRepository;
	@Override
	public List<Alumno> alumnosCurso(int idCurso) {
		if(cursosRepository.buscarCursoPorId(idCurso)!=null) {
			return alumnosRepository.alumnosCurso(idCurso);
		}else {
			return null;
		}
	}

}
