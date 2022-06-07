package com.example.demo.service;

import com.example.demo.model.Materia;

public interface IMateriaService {

	// crear
	public void insertarService(Materia e);

	// read
	public Materia buscarService(String nombre);

	// update
	public void actualizarService(Materia e);

	// delete
	public void eliminarService(String nombre);

}
