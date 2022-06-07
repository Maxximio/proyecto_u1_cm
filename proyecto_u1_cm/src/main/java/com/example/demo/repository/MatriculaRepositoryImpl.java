package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Estudiante;
import com.example.demo.model.Materia;

@Repository
public class MatriculaRepositoryImpl implements IMateriaRepository{

	@Override
	public void insertar(Materia e) {
		// TODO Auto-generated method stub
		System.out.println("inserta la materia");
	}

	@Override
	public Materia buscar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("se esta buscando por el nombre de la materia");
		return null;
	}

	@Override
	public void actualizar(Materia e) {
		// TODO Auto-generated method stub
		System.out.println("se actualiza la materia");
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se elimina la materia");
	}

	

	
}
