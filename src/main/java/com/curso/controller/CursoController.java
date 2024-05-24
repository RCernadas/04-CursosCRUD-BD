package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Curso;
import com.curso.service.CursoService;

@RestController
public class CursoController {
	@Autowired
	CursoService service;

	@GetMapping(value = "cursos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> curso() {
		return service.cursos();
	}

	@PostMapping(value = "cursos", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> altaCurso(@RequestBody Curso curso) {
		return service.altaCurso(curso);
	}

	@DeleteMapping(value = "cursos/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> eliminarCurso(@PathVariable int codCurso) {
		return service.eliminarCurso(codCurso);
	}

	@PutMapping(value = "cursos")
	public void actualizarDuracionCurso(@RequestParam("x") int codCurso, @RequestParam("y") int duracion) {
		service.actualizarDuracionCurso(codCurso, duracion);
	}

	@GetMapping(value = "cursos/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Curso buscarCurso(@PathVariable int codCurso) {
		return service.buscarCurso(codCurso);
	}

	@GetMapping(value = "cursos/precio", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> cursosPorRangoDePrecio(@RequestParam("x") double precioMin,
			@RequestParam("y") double precioMax) {
		return service.cursosPorRangoDePrecio(precioMin, precioMax);
	}

}
