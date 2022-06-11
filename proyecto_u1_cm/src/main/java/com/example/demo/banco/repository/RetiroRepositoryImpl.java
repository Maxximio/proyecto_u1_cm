package com.example.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin ){
		List <Retiro> listaConsultada=new ArrayList<>();
		
		Retiro reti1=new Retiro();
		reti1.setFechaRetiro(LocalDateTime.of(2000, 11, 13, 22, 1,30));
		reti1.setNumeroCuentaOrigen("1233");
		reti1.setValorRetiro(new BigDecimal(30));
		
		listaConsultada.add(reti1);
		
		return listaConsultada;
	}
		
	
}
