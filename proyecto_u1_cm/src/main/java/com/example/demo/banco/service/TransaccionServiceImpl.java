package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.Deposito;
import com.example.demo.banco.modelo.Retiro;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.repository.IDepositoRepository;
import com.example.demo.banco.repository.IRetiroRepository;
import com.example.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransaccionServiceImpl implements ITransacionService {

	@Autowired
	private ITransferenciaService iTransferenciaService;

	@Autowired
	private IDepositoService iDepositoService;

	@Autowired
	private IRetiroService iRetiroService;

	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;

	@Autowired
	private IDepositoRepository iDepositoRepository;

	@Autowired
	private IRetiroRepository iRetiroRepository;

	@Override
	public void transferencia(String origen, String destino, BigDecimal monto) {
		iTransferenciaService.realizarTransferencia(origen, destino, monto);
	}

	@Override
	public void deposito(String destino, BigDecimal monto) {
		iDepositoService.realizarDeposito(destino, monto);
	}

	@Override
	public void retiro(String ctaRetiro, BigDecimal monto) {
		iRetiroService.realizarRetiro(ctaRetiro, monto);
	}

	@Override
	public List<TransaccionTO> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		List<Transferencia> listaTrans = this.iTransferenciaRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Deposito> listaDepo = this.iDepositoRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Retiro> listaReti = this.iRetiroRepository.consultar(cuenta, fechaInicio, fechaFin);

		// unimos todas las listas
		List<TransaccionTO> listaFinal = null;

		for (Transferencia t : listaTrans) {
			TransaccionTO transaccionTO = this.transformar(t);
		}

		for (Deposito d : listaDepo) {
			TransaccionTO transaccionTO = this.transformar(d);
		}

		for (Retiro r : listaReti) {
			TransaccionTO transaccionTO = this.transformar(r);
		}

		return listaFinal;
	}

	private TransaccionTO transformar(Transferencia transferencia) {
		TransaccionTO traTo = new TransaccionTO();
		traTo.setFecha(transferencia.getFechaTransferencia());
		traTo.setMonto(transferencia.getMontoTransferir());
		traTo.setTipo("T");

		return traTo;
	}

	private TransaccionTO transformar(Deposito deposito) {
		TransaccionTO traTo = new TransaccionTO();
		traTo.setFecha(deposito.getFechaDeposito());
		traTo.setMonto(deposito.getValorDeposito());
		traTo.setTipo("D");

		return traTo;
	}

	private TransaccionTO transformar(Retiro retiro) {
		TransaccionTO traTo = new TransaccionTO();
		traTo.setFecha(retiro.getFechaRetiro());
		traTo.setMonto(retiro.getValorRetiro());
		traTo.setTipo("R");

		return traTo;
	}

}
