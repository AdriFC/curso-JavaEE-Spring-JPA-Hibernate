package com.cursos.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cursos.model.Alumno;
import com.cursos.service.AlumnosService;

@Controller
public class AlumnosController {

	@Autowired
	AlumnosService service;
	@GetMapping("alumnosCurso")
	public String alumnosCurso(@RequestParam("idCurso") int idCurso, HttpServletRequest request) {
		List<Alumno> alumnos=service.alumnosCurso(idCurso);
		if(alumnos!=null&&alumnos.size()>0) {
			request.setAttribute("alumnos", alumnos);
			return "alumnos";
		}else {
			return "sinalumnos";
		}
	}
}
