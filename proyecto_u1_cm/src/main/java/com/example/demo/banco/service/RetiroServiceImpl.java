package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Deposito;
import com.example.demo.banco.modelo.Retiro;
import com.example.demo.banco.repository.IDepositoRepository;
import com.example.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService{

	@Autowired
	private IRetiroRepository retiroRepository;
	
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaService;

	@Override
	public void realizarRetiro(String numeroCuenta, BigDecimal valor) {
		CuentaBancaria ctaRetirar=this.bancariaService.buscarService(numeroCuenta);
		
		BigDecimal saldoFinal=ctaRetirar.getSaldo().subtract(valor);
		
		ctaRetirar.setSaldo(saldoFinal);
		this.bancariaService.actualizarService(ctaRetirar);
		
		Retiro retiro=new Retiro();
		
		
		
		retiro.setNumeroCuentaOrigen(numeroCuenta);
		retiro.setValorRetiro(valor);
		retiro.setFechaRetiro(LocalDateTime.now());
		retiro.setNumRetiro(numeroCuenta+"2231");
		
		this.retiroRepository.insertar(retiro);
	}

	@Override
	public void insertarService(Retiro d) {
		this.retiroRepository.insertar(d);
	}

	@Override
	public Retiro buscarService(String numeroRetiro) {
		// TODO Auto-generated method stub
		return this.retiroRepository.buscar(numeroRetiro);
	}

	@Override
	public void actualizarService(Retiro d) {
		this.retiroRepository.actualizar(d);
	}

	@Override
	public void eliminarService(String numeroRetiro) {
		this.retiroRepository.eliminar(numeroRetiro);
		
	}

	

	
	
}
