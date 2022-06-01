package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Estudiante;

@Repository
public class EstudianteRepositoryImpl implements IEstudianteRepository{

	@Override
	public void insertar(Estudiante e) {
		//Aqui se realiza la insercion
		System.out.println("se ha insertado el estudiante");
	}

	@Override
	public Estudiante buscar(String apellido) {
		// TODO Auto-generated method stub
		
		System.out.println("Se busca estudiantes por apellido");
		return null;
	}

	@Override
	public void actualizar(Estudiante e) {
		// TODO Auto-generated method stub
		System.out.println("se ha actualizado");
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("se elimina al estudiante por cedula");
	}

	
}
