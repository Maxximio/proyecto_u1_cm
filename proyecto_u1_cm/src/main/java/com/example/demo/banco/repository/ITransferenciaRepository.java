package com.example.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {

	public void insertar(Transferencia t);
	public Transferencia buscar (String numeroDestino);
	public void actualizar (Transferencia t);
	public void eliminar (String numeroDestino);
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);
	
}
