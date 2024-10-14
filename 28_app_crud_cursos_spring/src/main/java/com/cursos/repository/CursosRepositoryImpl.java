package com.cursos.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.cursos.model.Curso;

public class CursosRepositoryImpl implements CursosRepository {

	@PersistenceContext(unitName = "cursosPU")
	EntityManager em;
	
	@Transactional
	@Override
	public void altaCurso(Curso curso) {
		em.persist(curso);
	}

	@Override
	public Curso buscarCursoPorId(int idCurso) {
		return em.find(Curso.class, idCurso);
	}

	@Transactional
	@Override
	public void eliminarCurso(Curso curso) {
		em.remove(buscarCursoPorId(curso.getIdCurso()));
	}
	
	@Transactional
	@Override
	public void actualizarCurso(Curso curso) {
		em.merge(curso);
	}

}
