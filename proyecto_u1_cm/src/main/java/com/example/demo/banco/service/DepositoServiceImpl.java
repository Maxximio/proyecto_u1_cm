package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Deposito;
import com.example.demo.banco.repository.IDepositoRepository;

@Service
public class DepositoServiceImpl implements IDepositoService{

	@Autowired
	private IDepositoRepository depositoRepository;
	
	@Autowired
	@Qualifier("ahorros")
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

	@Override
	public void insertarService(Deposito d) {
		this.depositoRepository.insertar(d);
	}

	@Override
	public Deposito buscarService(String numeroDestino) {
		// TODO Auto-generated method stub
		return this.depositoRepository.buscar(numeroDestino);
	}

	@Override
	public void actualizarService(Deposito d) {
		this.depositoRepository.actualizar(d);
	}

	@Override
	public void eliminarService(String numeroDestino) {
		this.depositoRepository.eliminar(numeroDestino);
	}

	
	
}
