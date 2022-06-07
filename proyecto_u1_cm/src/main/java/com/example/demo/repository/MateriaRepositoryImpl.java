package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Estudiante;
import com.example.demo.model.Materia;
import com.example.demo.model.Matricula;

@Repository
public class MateriaRepositoryImpl implements IMateriaRepository{

	@Override
	public void insertar(Materia e) {
		// TODO Auto-generated method stub
		System.out.println("Insertando la materia");
	}

	@Override
	public Materia buscar(String nombre) {
		System.out.println("buscando materia por nombre "+nombre);
		return null;
	}

	@Override
	public void actualizar(Materia e) {
		System.out.println("actualizando su materia");
	}

	@Override
	public void eliminar(String nombre) {
		System.out.println("eliminando materia de nombre "+nombre);
	}
}
