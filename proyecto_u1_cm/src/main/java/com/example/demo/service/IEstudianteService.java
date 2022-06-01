package com.example.demo.service;

import com.example.demo.model.Estudiante;

public interface IEstudianteService {

	// crear
	public void insertarService(Estudiante e);

	// read
	public Estudiante buscarService(String apellido);

	// update
	public void actualizarService(Estudiante e);

	// delete
	public void eliminarService(String cedula);

}
