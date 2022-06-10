package com.example.demo.banco.repository;

import com.example.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {

	public void insertar(CuentaBancaria c); 
	public void actualizar(CuentaBancaria c);
	public CuentaBancaria buscar(String numero);
	public void eliminar(String numero);
	
}
