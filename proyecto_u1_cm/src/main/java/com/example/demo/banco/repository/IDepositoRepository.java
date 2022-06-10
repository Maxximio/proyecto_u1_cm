package com.example.demo.banco.repository;

import com.example.demo.banco.modelo.Deposito;

public interface IDepositoRepository {

	public void insertar (Deposito d);
	public Deposito buscar (String numeroDestino);
	public void actualizar (Deposito d);
	public void eliminar (String numeroDestino);
	
	
}
