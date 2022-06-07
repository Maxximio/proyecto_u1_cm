package com.example.demo.repository;

import com.example.demo.model.Matricula;

public interface IMatriculaRepository {

	// crear
	public void insertar(Matricula e);

	// read
	public Matricula buscar(String numero);

	// update
	public void actualizar(Matricula e);

	// delete
	public void eliminar(String numero);

}
