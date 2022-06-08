package com.example.demo.banco.service;

import java.math.BigDecimal;

import com.example.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {

	//public void insertarService(Transferencia t);
	
	public void realizarTransferencia(String ctaOrigen,String ctaDestino,BigDecimal valor);
	
}
