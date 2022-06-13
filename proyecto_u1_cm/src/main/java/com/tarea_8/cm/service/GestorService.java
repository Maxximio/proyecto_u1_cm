package com.tarea_8.cm.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarea_8.cm.model.Inventario;
import com.tarea_8.cm.model.ReporteTO;

@Service
public class GestorService implements IGestionService {

	@Autowired
	private IInventarioService iInventarioService;

	@Autowired
	private IProductoService iProductoService;

	@Override
	public List<ReporteTO> aniadirP(String nombreProd, BigDecimal valor, int cantidad) {
		
		List<Inventario> listaInv=this.iInventarioService.insertaProducto(nombreProd, valor,cantidad);
		
		List<ReporteTO> listaFinal=null;
		
		for(Inventario i:listaInv) {
			ReporteTO reporte=this.transformar(i);
			
			listaFinal.add(reporte);
			
			System.out.println("Se a;adio a DB");
		}
		
		return listaFinal;

	}

	private ReporteTO transformar(Inventario inventario) {
		
		ReporteTO repor=new ReporteTO();
		repor.setNombre(inventario.getProducto().getNombre());
		repor.setCantidad(inventario.getStock());
		repor.setFechaIngreso(inventario.getFechaIngreso());
		
		//calculo para el reporte
		BigDecimal pc=inventario.getProducto().getValor(); 
		
		BigDecimal g=pc.multiply(new BigDecimal(0.1));
		BigDecimal iva=pc.multiply(new BigDecimal(0.12));
		
		BigDecimal pv=pc.add(g).add(iva);
		//fin del calculo
		
		repor.setPrecioVenta(pv);
		
		return repor;
	}

	@Override
	public void mostrar(LocalDateTime fecha) {
		
	}
	
	
}
