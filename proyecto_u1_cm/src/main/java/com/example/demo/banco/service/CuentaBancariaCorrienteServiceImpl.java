package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.repository.ICuentaBancariaRepository;

@Service
@Qualifier("corriente")
public class CuentaBancariaCorrienteServiceImpl implements ICuentaBancariaService{

	@Autowired
	private ICuentaBancariaRepository bancariaRepository;
	
	@Override
	public void insertarService(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarService(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuentaBancaria buscarService(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarService(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularInteres(String numCuenta,BigDecimal saldo) {
		
		//CuentaBancaria cta=this.bancariaRepository.buscar(numCuenta);
		
		//BigDecimal saldo=null;
		BigDecimal interes=saldo.multiply(new BigDecimal(15)).divide(new BigDecimal(100));
		
		return interes;
	}

}
