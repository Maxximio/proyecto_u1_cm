package com.tarea_8.cm.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarea_8.cm.model.Inventario;
import com.tarea_8.cm.repository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService{

	@Autowired
	private IInventarioRepository iInventarioRepository;
	
	@Override
	public void insertarService(Inventario i) {
		this.iInventarioRepository.insertar(i);
	}

	@Override
	public void actualizarService(Inventario i) {
		this.iInventarioRepository.actualizar(i);
	}

	@Override
	public Inventario buscarService(String codigoBarras) {
		return this.iInventarioRepository.buscar(codigoBarras);
	}

	@Override
	public void eliminarService(String codigoBarras) {
		this.iInventarioRepository.eliminar(codigoBarras);
	}

	@Override
	public List<Inventario> insertaProducto(String nombreProd, BigDecimal valor, int cantidad) {
		// TODO Auto-generated method stub
		return this.iInventarioRepository.insertaProdu(nombreProd, valor, cantidad);
	}

}
