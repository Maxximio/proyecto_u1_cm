package com.tarea_8.cm.service;

import com.tarea_8.cm.model.Producto;

public interface IProductoService {

	public void insertarService(Producto p); 
	public void actualizarService(Producto p);
	public Producto buscarService(String nombreProducto);
	public void eliminarService(String nombreProducto);
	
}
