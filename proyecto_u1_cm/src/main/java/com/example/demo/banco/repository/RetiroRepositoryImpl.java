package com.example.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.Deposito;
import com.example.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository{

	@Override
	public void insertar(Retiro r) {
		System.out.println("Generamos el retiro: "+r); 
	}

	@Override
	public Retiro buscar(String numeroRetiro) {
		System.out.println("se busca retiro de numero: "+numeroRetiro);
		return null;
	}

	@Override
	public void actualizar(Retiro r) {
		System.out.println("actualizando el retiro...");
	}

	@Override
	public void eliminar(String numeroRetiro) {
		System.out.println("se elimina el retiro: "+numeroRetiro);
		
	}

	
}
