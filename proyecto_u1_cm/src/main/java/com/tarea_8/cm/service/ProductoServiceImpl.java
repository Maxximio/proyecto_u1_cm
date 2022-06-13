package com.tarea_8.cm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarea_8.cm.model.Producto;
import com.tarea_8.cm.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepository iProductoRepository;
	
	@Override
	public void insertarService(Producto p) {
		this.iProductoRepository.insertar(p);
	}

	@Override
	public void actualizarService(Producto p) {
		this.iProductoRepository.actualizar(p);
	}

	@Override
	public Producto buscarService(String nombreProducto) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.buscar(nombreProducto);
	}

	@Override
	public void eliminarService(String nombreProducto) {
		this.iProductoRepository.eliminar(nombreProducto);
	}

}
