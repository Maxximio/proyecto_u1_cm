package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Estudiante;
import com.example.demo.model.Materia;
import com.example.demo.model.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@Override
	public void insertar(Matricula e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insetrtado la matricula "+e);
	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("se busca la matricula por numero "+numero);
		return null;
	}

	@Override
	public void actualizar(Matricula e) {
		// TODO Auto-generated method stub
		System.out.println("actualizando matricula");
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("eliminando matricula por numero "+numero);
	}

	
	
}
