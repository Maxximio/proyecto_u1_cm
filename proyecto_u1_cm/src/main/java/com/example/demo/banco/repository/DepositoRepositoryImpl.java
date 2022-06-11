package com.example.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.Deposito;
import com.example.demo.banco.modelo.Transferencia;

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
	
	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin ){
		List <Deposito> listaConsultada=new ArrayList<>();
		Deposito depo1=new Deposito();
		depo1.setFechaDeposito(LocalDateTime.now());
		depo1.setNumeroCuentaDestino("1243");
		depo1.setValorDeposito(new BigDecimal(20));
		
		listaConsultada.add(depo1);
		
		Deposito depo2=new Deposito();
		depo2.setFechaDeposito(LocalDateTime.now().plusDays(500));
		depo2.setNumeroCuentaDestino("2432");
		depo2.setValorDeposito(new BigDecimal(10));
		
		listaConsultada.add(depo2);
		
		return listaConsultada;
		
	}
}
