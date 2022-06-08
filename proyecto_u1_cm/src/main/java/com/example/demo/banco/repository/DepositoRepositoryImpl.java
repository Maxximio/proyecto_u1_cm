package com.example.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository{

	@Override
	public void insertar(Deposito d) {
		System.out.println("Aqui se creo el deposito "+d);
	}
}
