package com.tarea_8.cm.model;

import java.math.BigDecimal;

public class Producto {
	
	private String nombre;
	private BigDecimal valor;
	private String tipo;
	
	//set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//to string
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", valor=" + valor + ", tipo=" + tipo + "]";
	}
}
