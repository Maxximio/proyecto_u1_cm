package com.example.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin ){
		List <Transferencia> listaConsultada=new ArrayList<>();
		Transferencia trans1=new Transferencia();
		
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNumeroCuentaDestino("1234");
		trans1.setNumeroCuentaOrigen("3211");
		
		listaConsultada.add(trans1);
		
		return listaConsultada;
		
	}
}
