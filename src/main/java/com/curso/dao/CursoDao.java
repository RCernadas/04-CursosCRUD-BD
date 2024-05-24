package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.model.Curso;

/**
 * Interfaz CursoDao encargada de la interacción directa con nuestra BD y que
 * extiende de la clase JpaRepository
 */
public interface CursoDao extends JpaRepository<Curso, Integer> {

	/**
	 * Método que devuelve los cursos entre un rango de precios pasados por
	 * parámetro
	 * 
	 * @param precioMin
	 * @param precioMax
	 * @return cursos entre el reango de precios
	 */
	@Query("SELECT c FROM Curso c WHERE c.precio>=:precioMin AND c.precio <=:precioMax")
	List<Curso> cursosPorRangoDePrecio(@Param("precioMin") double precioMin, @Param("precioMax") double precioMax);
}
