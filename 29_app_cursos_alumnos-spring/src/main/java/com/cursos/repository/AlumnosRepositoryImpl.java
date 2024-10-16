package com.cursos.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cursos.model.Alumno;

@Repository
public class AlumnosRepositoryImpl implements AlumnosRepository {
	@PersistenceContext(unitName = "cursosPU")
	EntityManager em;
	@Override
	public List<Alumno> alumnosCurso(int idCurso) {
		String jpql="select a from Alumno a where a.curso.idCurso=?1";
		TypedQuery<Alumno> query=em.createQuery(jpql, Alumno.class);
		query.setParameter(1, idCurso);
		return query.getResultList();
	}

}
