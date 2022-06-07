package com.example.demo.repository;

import com.example.demo.model.Materia;

public interface IMateriaRepository {

	// crear
	public void insertar(Materia e);

	// read
	public Materia buscar(String nombre);

	// update
	public void actualizar(Materia e);

	// delete
	public void eliminar(String nombre);

}
