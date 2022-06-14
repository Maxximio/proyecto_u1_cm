package com.example.demo.banco.service;

import java.math.BigDecimal;

import com.example.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	public void insertarService(CuentaBancaria c); 
	public void actualizarService(CuentaBancaria c);
	public CuentaBancaria buscarService(String numero);
	public void eliminarService(String numero);
	public BigDecimal calcularInteres(String numCuenta, BigDecimal saldo);
}
