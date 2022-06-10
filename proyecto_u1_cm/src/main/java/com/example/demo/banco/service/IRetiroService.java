package com.example.demo.banco.service;

import java.math.BigDecimal;

import com.example.demo.banco.modelo.Retiro;

public interface IRetiroService {

	public void realizarRetiro(String numeroCuenta,BigDecimal valor);
	public void insertarService (Retiro d);
	public Retiro buscarService (String numeroRetiro);
	public void actualizarService (Retiro d);
	public void eliminarService (String numeroRetiro);
}
