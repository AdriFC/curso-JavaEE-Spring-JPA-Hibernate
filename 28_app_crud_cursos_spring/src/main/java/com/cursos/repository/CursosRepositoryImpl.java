package com.cursos.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cursos.model.Curso;

@Repository
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

	@Override
	public List<Curso> cursosDuracion(int duracion) {
		String jpql = "select c from Curso c where c.duracion<=?1";
		TypedQuery<Curso> query = em.createQuery(jpql, Curso.class);
		query.setParameter(1, duracion);
		return query.getResultList();
	}

}
