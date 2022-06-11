package com.example.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.banco.modelo.Deposito;
import com.example.demo.banco.modelo.Transferencia;

public interface IDepositoRepository {

	public void insertar (Deposito d);
	public Deposito buscar (String numeroDestino);
	public void actualizar (Deposito d);
	public void eliminar (String numeroDestino);
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);
	
	
}
