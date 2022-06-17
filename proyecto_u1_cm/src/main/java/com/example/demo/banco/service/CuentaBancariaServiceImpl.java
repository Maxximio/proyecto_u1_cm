package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Retiro;
import com.example.demo.banco.repository.ICuentaBancariaRepository;

@Service
@Qualifier("ahorro")
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{

	@Autowired
	private ICuentaBancariaRepository cuentaRepo;
	
	@Autowired
	private CuentaBancaria cuentaBancaria;
	
	@Override
	public void actualizarService(CuentaBancaria c) {
		this.cuentaRepo.actualizar(c);
	}

	@Override
	public CuentaBancaria buscarService(String numero) {
		return this.cuentaRepo.buscar(numero);
	}

	@Override
	public void insertarService(CuentaBancaria c) {
		
		System.out.println("La unica cuenta Bancaria es (SINGLLETON)");
		
		System.out.println(this.cuentaBancaria);

		this.cuentaRepo.insertar(c);
	}

	@Override
	public void eliminarService(String numero) {
		this.cuentaRepo.eliminar(numero);
	}

	@Override
	public BigDecimal calcularInteres(String numCuenta, BigDecimal saldo) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
