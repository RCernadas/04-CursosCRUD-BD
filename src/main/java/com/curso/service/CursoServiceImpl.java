package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.CursoDao;
import com.curso.model.Curso;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CursoServiceImpl implements CursoService{
	
	@Autowired
	CursoDao dao;

	@Override
	public List<Curso> cursos() {
		return dao.findAll();
	}

	@Override
	public List<Curso> altaCurso(Curso curso) {
		dao.save(curso);
		return dao.findAll();
	}

	@Override
	public List<Curso> eliminarCurso(int codCurso) {
		dao.deleteById(codCurso);
		return dao.findAll();
	}

	@Override
	public void actualizarDuracionCurso(int codCurso, int duracion) {		
		Curso cursoEncontrado = dao.findById(codCurso).orElseThrow(() -> new EntityNotFoundException());
		cursoEncontrado.setDuracion(duracion);
		dao.save(cursoEncontrado);
	}

	@Override
	public Curso buscarCurso(int codCurso) {
		return dao.findById(codCurso).orElseThrow(() -> new EntityNotFoundException());
	}

	@Override
	public List<Curso> cursosPorRangoDePrecio(double precioMin, double precioMax) {
		return dao.cursosPorRangoDePrecio(precioMin, precioMax);
	}
	
}
