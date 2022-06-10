package com.example.demo.banco.repository;

import com.example.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {

	public void insertar(Transferencia t);
	public Transferencia buscar (String numeroDestino);
	public void actualizar (Transferencia t);
	public void eliminar (String numeroDestino);
	
}
