package com.example.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Deposito {

	private LocalDateTime fechaDeposito;
	private String numeroCuentaDestino;
	private BigDecimal valorDeposito;
	
	//set y get
	public LocalDateTime getFechaDeposito() {
		return fechaDeposito;
	}
	public void setFechaDeposito(LocalDateTime fechaDeposito) {
		this.fechaDeposito = fechaDeposito;
	}
	public String getNumeroCuentaDestino() {
		return numeroCuentaDestino;
	}
	public void setNumeroCuentaDestino(String numeroCuentaDestino) {
		this.numeroCuentaDestino = numeroCuentaDestino;
	}
	public BigDecimal getValorDeposito() {
		return valorDeposito;
	}
	public void setValorDeposito(BigDecimal valorDeposito) {
		this.valorDeposito = valorDeposito;
	}
	
	//to string
	@Override
	public String toString() {
		return "Deposito [fechaDeposito=" + fechaDeposito + ", numeroCuentaDestino=" + numeroCuentaDestino
				+ ", valorDeposito=" + valorDeposito + "]";
	}
}
