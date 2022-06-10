package com.example.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository{

	@Override
	public void insertar(Deposito d) {
		System.out.println("Aqui se creo el deposito "+d);
	}

	@Override
	public Deposito buscar(String numeroDestino) {
		System.out.println("se busca numeros de cuenta con: "+numeroDestino);
		return null;
	}

	@Override
	public void actualizar(Deposito d) {
		System.out.println("actualizando el deposito: "+d);
	}

	@Override
	public void eliminar(String numeroDestino) {
		System.out.println("eliminando el deposito "+numeroDestino);
	}
}
