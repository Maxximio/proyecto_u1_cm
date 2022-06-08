package com.example.demo.banco.service;

import java.math.BigDecimal;

public interface IDepositoService {

	public void realizarDeposito(String numeroCuenta,BigDecimal valor);
	
}
