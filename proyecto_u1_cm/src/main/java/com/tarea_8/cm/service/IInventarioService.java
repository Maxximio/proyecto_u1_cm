package com.tarea_8.cm.service;

import java.math.BigDecimal;
import java.util.List;

import com.tarea_8.cm.model.Inventario;

public interface IInventarioService {

	public void insertarService(Inventario i); 
	public void actualizarService(Inventario i);
	public Inventario buscarService(String codigoBarras);
	public void eliminarService(String codigoBarras);
	
	public List<Inventario> insertaProducto(String nombreProd, BigDecimal valor, int cantidad);
	
}
