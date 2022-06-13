package com.tarea_8.cm.repository;

import java.math.BigDecimal;
import java.util.List;

import com.tarea_8.cm.model.Inventario;

public interface IInventarioRepository {

	public void insertar(Inventario p); 
	public void actualizar(Inventario p);
	public Inventario buscar(String codigoBarras);
	public void eliminar(String codigoBarras);
	
	public List<Inventario> insertaProdu(String nombreProd, BigDecimal valor, int cantidad);
	
	
}
