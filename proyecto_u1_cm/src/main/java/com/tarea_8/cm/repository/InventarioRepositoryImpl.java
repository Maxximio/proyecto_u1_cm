package com.tarea_8.cm.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tarea_8.cm.model.Inventario;
import com.tarea_8.cm.model.Producto;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository{

	@Override
	public void insertar(Inventario p) {
		System.out.println("se inserto "+p+" en base de datos");
	}

	@Override
	public void actualizar(Inventario p) {
		System.out.println("se actualizo el "+p);
	}

	@Override
	public Inventario buscar(String codigoBarras) {

		System.out.println("buscando el Inventario...");
		Inventario inv=new Inventario();
		inv.setCodigoBarras(codigoBarras);
		inv.setFechaIngreso(LocalDateTime.of(2022, 6, 12, 14, 30));
		inv.setStock(10);
		
		Producto pro=new Producto();
		pro.setNombre("Queso Mozarella");
		pro.setTipo("comida");
		pro.setValor(new BigDecimal(10));
		
		inv.setProducto(pro);
		
		
		return inv;
	}

	@Override
	public void eliminar(String codigoBarras) {
		System.out.println("se elimino el inventario del sistema");
	}

	@Override
	public List<Inventario> insertaProdu(String nombreProd, BigDecimal valor, int cantidad) {
		List<Inventario> listaReportes=new ArrayList<>();
		Inventario inv=new Inventario();
		
		inv.setFechaIngreso(LocalDateTime.now());
		inv.setStock(cantidad);
		inv.setCodigoBarras(nombreProd+"11"+cantidad);
		
		
		Producto pro =new Producto();
		pro.setNombre(nombreProd);
		pro.setTipo("comida");
		pro.setValor(valor);
		
		
		inv.setProducto(pro);
		
		listaReportes.add(inv);
		
		return listaReportes;
	}

}
