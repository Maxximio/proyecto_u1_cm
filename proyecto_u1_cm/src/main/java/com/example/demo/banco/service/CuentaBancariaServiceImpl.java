package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.repository.ICuentaBancariaRepository;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{

	@Autowired
	private ICuentaBancariaRepository cuentaRepo;
	
	@Override
	public void actualizarService(CuentaBancaria c) {
		this.cuentaRepo.actualizar(c);
	}

	@Override
	public CuentaBancaria buscarService(String numero) {
		return this.cuentaRepo.buscar(numero);
	}

}
