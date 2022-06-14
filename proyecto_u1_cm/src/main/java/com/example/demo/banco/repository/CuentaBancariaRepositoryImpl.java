package com.example.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository{

	@Override
	public void actualizar(CuentaBancaria c) {
		//aqui se reemplaza con sql
		System.out.println("Cuenta Bancaria actualizada a "+c);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		
		System.out.println("Se busca la cuenta: "+numero);
		CuentaBancaria cta=new CuentaBancaria();
		cta.setNumero(numero);
		cta.setSaldo(new BigDecimal(100));
		cta.setTipo("C");
		return cta;
	}

	@Override
	public void insertar(CuentaBancaria c) {
		System.out.println("se inserta el numero de cuenta "+ c);
	}

	@Override
	public void eliminar(String numero) {
		System.out.println("eliminando cuenta de numero: "+numero);
	}

}
