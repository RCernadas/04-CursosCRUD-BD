package com.curso.service;

import java.util.List;

import com.curso.model.Curso;

public interface CursoService {
	
	/**
	 * Método que devuelve todos los cursos
	 * @return lista de cursos
	 */
	List<Curso> cursos();
	
	/**
	 * Método para dar de alta un curso nuevo
	 * @param curso curso
	 * @return la lista de cursos actualizada
	 */
	List<Curso> altaCurso(Curso curso);
	
	/**
	 * Método para eliminar un curso
	 * @param codCurso código del curso
	 * @return la lista de cursos actualizada
	 */
	List<Curso> eliminarCurso(int codCurso);
	
	/**
	 * Método para actualizar la duración de un curso determinado
	 * @param codCurso código del curso del que deseamos cambiar sus horas
	 * @param duracion la nueva duración en horas 
	 */
	void actualizarDuracionCurso(int codCurso, int duracion);
	
	/**
	 * Método para buscar un curso determinado
	 * @param codCurso código del curso a buscar
	 * @return la lista de cursos actualizadas
	 */
	Curso buscarCurso(int codCurso);
	
	/**
	 * Método para buscar cursos en un rango de precio determinado
	 * @param precioMin
	 * @param precioMax
	 * @return la lista de cursos actualizada
	 */
	List<Curso> cursosPorRangoDePrecio(double precioMin, double precioMax);
	
}
