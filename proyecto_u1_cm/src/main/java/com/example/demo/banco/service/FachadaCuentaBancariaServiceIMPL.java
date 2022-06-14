package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.repository.ICuentaBancariaRepository;

@Service
public class FachadaCuentaBancariaServiceIMPL implements IFachadaCuentaBancaria{

	@Autowired
	@Qualifier("corriente")
	ICuentaBancariaService bancariaService;
	
	@Autowired
	@Qualifier("ahorros")
	ICuentaBancariaService bancariaServiceA;
	
	@Autowired
	private ICuentaBancariaRepository bancariaRepository;
	
	@Override
	public BigDecimal calcularInteres(String numeroCuenta) {
		CuentaBancaria cta=this.bancariaRepository.buscar(numeroCuenta);
		BigDecimal interes=null;
		
		
		if(cta.getTipo().equals("A")) {
			interes=this.bancariaServiceA.calcularInteres(numeroCuenta, cta.getSaldo());
		}else {
			interes= this.bancariaService.calcularInteres(numeroCuenta, cta.getSaldo());
		}
		
		return interes;
	}

}
