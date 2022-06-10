package com.example.demo.banco.service;

import java.math.BigDecimal;

import com.example.demo.banco.modelo.Deposito;

public interface IDepositoService {

	public void realizarDeposito(String numeroCuenta,BigDecimal valor);
	public void insertarService (Deposito d);
	public Deposito buscarService (String numeroDestino);
	public void actualizarService (Deposito d);
	public void eliminarService (String numeroDestino);
}
