package com.tarea_8.cm.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.tarea_8.cm.model.ReporteTO;

public interface IGestionService {

	public List<ReporteTO> aniadirP(String nombreProd, BigDecimal valor, int cantidad);

	public void mostrar(LocalDateTime fecha);
	
}
