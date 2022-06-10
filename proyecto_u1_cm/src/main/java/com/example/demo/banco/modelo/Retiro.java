package com.example.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {

	private String numRetiro;
	private LocalDateTime fechaRetiro;
	private String numeroCuentaOrigen;
	private BigDecimal valorRetiro;
	
	//set y get
	public String getNumRetiro() {
		return numRetiro;
	}
	public void setNumRetiro(String numRetiro) {
		this.numRetiro = numRetiro;
	}
	public LocalDateTime getFechaRetiro() {
		return fechaRetiro;
	}
	public void setFechaRetiro(LocalDateTime fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}
	public String getNumeroCuentaOrigen() {
		return numeroCuentaOrigen;
	}
	public void setNumeroCuentaOrigen(String numeroCuentaOrigen) {
		this.numeroCuentaOrigen = numeroCuentaOrigen;
	}
	public BigDecimal getValorRetiro() {
		return valorRetiro;
	}
	public void setValorRetiro(BigDecimal valorRetiro) {
		this.valorRetiro = valorRetiro;
	}
	
	//to string
	@Override
	public String toString() {
		return "Retiro [numRetiro=" + numRetiro + ", fechaRetiro=" + fechaRetiro + ", numeroCuentaOrigen="
				+ numeroCuentaOrigen + ", valorRetiro=" + valorRetiro + "]";
	}
	
}
