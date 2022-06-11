package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface ITransacionService {

	public void transferencia(String origen,String destino,BigDecimal monto);
	public void deposito(String destino, BigDecimal monto);
	public void retiro(String ctaRetiro,BigDecimal monto);
	
	public List<TransaccionTO> consultar(String cuenta,LocalDateTime fechaInicio,LocalDateTime fechaFin);
}
