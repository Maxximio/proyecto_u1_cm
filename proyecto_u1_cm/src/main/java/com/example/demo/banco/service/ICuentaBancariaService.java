package com.example.demo.banco.service;

import com.example.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	public void actualizarService(CuentaBancaria c);
	public CuentaBancaria buscarService(String numero);
	
}
