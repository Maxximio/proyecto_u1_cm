package com.tarea_8.cm.model;

import java.time.LocalDateTime;

public class Inventario {

	private LocalDateTime fechaIngreso;
	private int stock;
	private String codigoBarras;
	
	private Producto producto;

	//set y get
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	//to string
	@Override
	public String toString() {
		return "Inventario [fechaIngreso=" + fechaIngreso + ", stock=" + stock + ", codigoBarras=" + codigoBarras
				+ ", producto=" + producto + "]";
	}
	
	
}
