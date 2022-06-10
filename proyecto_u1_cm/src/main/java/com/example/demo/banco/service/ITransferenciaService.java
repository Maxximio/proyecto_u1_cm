package com.example.demo.banco.service;

import java.math.BigDecimal;

import com.example.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {

	//public void insertarService(Transferencia t);
	
	public void realizarTransferencia(String ctaOrigen,String ctaDestino,BigDecimal valor);
	public void insertarService(Transferencia t);
	public Transferencia buscarService (String numeroDestino);
	public void actualizarService (Transferencia t);
	public void eliminarService (String numeroDestino);
}
