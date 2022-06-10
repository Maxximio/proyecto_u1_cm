package com.example.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository{

	@Override
	public void insertar(Transferencia t) {
		
		System.out.println("Se inserta la transferencia "+t);
	}

	@Override
	public Transferencia buscar(String numeroDestino) {
		System.out.println("buscando transferencia con: "+numeroDestino );
		return null;
	}

	@Override
	public void actualizar(Transferencia t) {
		System.out.println("actualizando transferencia  "+t);
	}

	@Override
	public void eliminar(String numeroDestino) {
		System.out.println( "eliminando la transferencia de  "+numeroDestino);
	}

}
