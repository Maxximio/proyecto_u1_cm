package com.tarea_8.cm.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.tarea_8.cm.model.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository{

	@Override
	public void insertar(Producto p) {
		System.out.println("Se ha insertado el "+p+ " en base de datos");
	}

	@Override
	public void actualizar(Producto p) {
		System.out.println("se actualizo el producto");
	}

	@Override
	public Producto buscar(String nombreProducto) {
		
		System.out.println("se esta buscando el producto...");
		
		Producto pro=new Producto();
		pro.setNombre(nombreProducto);
		pro.setTipo("lacteos");
		pro.setValor(new BigDecimal(10));

		System.out.println("Producto encontrado");
		
		return pro;
	}

	@Override
	public void eliminar(String nombreProducto) {
		System.out.println("el producto se ha eliminado");
	}

}
