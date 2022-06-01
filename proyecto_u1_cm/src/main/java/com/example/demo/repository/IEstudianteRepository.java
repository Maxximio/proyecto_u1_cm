package com.example.demo.repository;

import com.example.demo.model.Estudiante;

public interface IEstudianteRepository {

	//crear
	public void insertar(Estudiante e) ;
	
	//read
	public Estudiante buscar(String apellido);
	
	//update
	public void actualizar(Estudiante e);
	
	//delete
	public void eliminar(String cedula);
}
