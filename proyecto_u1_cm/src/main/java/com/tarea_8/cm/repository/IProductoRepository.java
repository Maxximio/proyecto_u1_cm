package com.tarea_8.cm.repository;

import com.tarea_8.cm.model.Producto;

public interface IProductoRepository {

	public void insertar(Producto p); 
	public void actualizar(Producto p);
	public Producto buscar(String nombreProducto);
	public void eliminar(String nombreProducto);
	
}
