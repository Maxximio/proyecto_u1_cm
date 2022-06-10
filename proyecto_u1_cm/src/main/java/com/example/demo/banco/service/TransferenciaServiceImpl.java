package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService{

	@Autowired
	private ITransferenciaRepository transRepo;
	
	@Autowired
	private ICuentaBancariaService ctaService;
	
	@Override
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal valor) {
		
		CuentaBancaria cOrigen=this.ctaService.buscarService(ctaOrigen);
		BigDecimal saldoOrigen=cOrigen.getSaldo();
		BigDecimal nuevoSaldoOrigen=saldoOrigen.subtract(valor);
		cOrigen.setSaldo(nuevoSaldoOrigen);
		this.ctaService.actualizarService(cOrigen);
		
		CuentaBancaria cDestino=this.ctaService.buscarService(ctaDestino);
		BigDecimal saldoDestino=cDestino.getSaldo();
		BigDecimal nuevoSaldoDestino=saldoDestino.add(valor);
		cDestino.setSaldo(nuevoSaldoDestino);
		this.ctaService.actualizarService(cDestino);
		
		Transferencia trans=new Transferencia();
		trans.setNumeroCuentaOrigen(ctaOrigen);
		trans.setNumeroCuentaDestino(ctaDestino);
		trans.setMontoTransferir(valor);
		trans.setFechaTransferencia(LocalDateTime.now());
		
		transRepo.insertar(trans);
	}

	@Override
	public void insertarService(Transferencia t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Transferencia buscarService(String numeroDestino) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarService(Transferencia t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarService(String numeroDestino) {
		// TODO Auto-generated method stub
		
	}

}
