package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Deposito;
import com.example.demo.banco.repository.IDepositoRepository;

@Service
public class DepositoServiceImpl implements IDepositoService{

	@Autowired
	private IDepositoRepository depositoRepository;
	
	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Override
	public void realizarDeposito(String numeroCuenta, BigDecimal valor) {
		CuentaBancaria ctaDestino=this.bancariaService.buscarService(numeroCuenta);
		BigDecimal saldoDestino=ctaDestino.getSaldo();
		BigDecimal saldoFinal=saldoDestino.add(valor);
		
		ctaDestino.setSaldo(saldoFinal);
		this.bancariaService.actualizarService(ctaDestino);
		
		Deposito deposito=new Deposito();
		deposito.setNumeroCuentaDestino(numeroCuenta);
		deposito.setValorDeposito(valor);
		deposito.setFechaDeposito(LocalDateTime.now());
		
		this.depositoRepository.insertar(deposito);
	}

	
	
}
