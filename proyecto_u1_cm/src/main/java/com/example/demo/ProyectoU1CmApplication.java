package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.repository.IRetiroRepository;
import com.example.demo.banco.service.IDepositoService;
import com.example.demo.banco.service.IFachadaCuentaBancaria;
import com.example.demo.banco.service.IRetiroService;
import com.example.demo.banco.service.ITransferenciaService;
import com.example.demo.model.Estudiante;
import com.example.demo.model.Materia;
import com.example.demo.model.Matricula;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IMateriaService;
import com.example.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1CmApplication implements CommandLineRunner{

//	@Autowired
//	private IEstudianteService estudService;
//	
//	@Autowired
//	private IMateriaService mateService;
//	
//	@Autowired
//	private IMatriculaService matriService;
	
//	@Autowired
//	private ITransferenciaService iTransferenciaService;
//	
//	@Autowired
//	private IDepositoService depositoService;
//	
//	@Autowired
//	private IRetiroService retiService;
	
	@Autowired
	private IFachadaCuentaBancaria bancaria;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		BigDecimal interes=this.bancaria.calcularInteres("123");
		
		System.out.println("/////////////////el interes es de: "+interes+"/////////////////");
		
		/////////tarea8
		
//		iGestionService.aniadirP("Queso", new BigDecimal(10), 100);
//		iGestionService.aniadirP("Leche", new BigDecimal(2), 200);
//		iGestionService.aniadirP("Mantequilla", new BigDecimal(2), 40);
//		iGestionService.aniadirP("Avena", new BigDecimal(2), 20);
//		iGestionService.aniadirP("Carne res101", new BigDecimal(5), 20);
//		
//		
//		iGestionService.mostrar(LocalDateTime.of(2022, 06, 14, 3, 20));
//		
//		System.out.println("/////////////////Estudiante///////////////////");
//		Estudiante e=new Estudiante();
//		
//		e.setNombre("Carlos");
//		e.setApellido("Montalvo");
//		e.setCedula("162343675465");
//		
//		estudService.insertarService(e);
//		estudService.actualizarService(e);
//		estudService.buscarService(e.getApellido());
//		estudService.eliminarService(e.getCedula());
//	
//		System.out.println("/////////////////Materia///////////////////");
//		Materia m=new Materia();
//		m.setNombre("Ingles");
//		m.setSemestre("4");
//	
//		mateService.insertarService(m);
//		mateService.buscarService(m.getNombre());
//		mateService.actualizarService(m);
//		mateService.eliminarService(m.getNombre());
//		
//		System.out.println("/////////////////Matricula///////////////////");
//		Matricula tri =new Matricula();
//		tri.setEstudiante(e);
//		List<Materia> misMaterias = new ArrayList<>(); 
//		misMaterias.add(m);
//		tri.setMateria(misMaterias);
//		tri.setNumero("132546");
//		
//		matriService.insertarService(tri);
//		matriService.buscarService(tri.getNumero());
//		matriService.actualizarService(tri);
//		matriService.eliminarService(tri.getNumero());
		
//		CuentaBancaria cta1=new CuentaBancaria();
//		CuentaBancaria cta2=new CuentaBancaria();
//		
//		cta1.setNumero("123");
//		cta1.setSaldo(new BigDecimal(200));
		
//		System.out.println("///////////////////////////transferencia///////////////////");
//		iTransferenciaService.realizarTransferencia("123", "321", new BigDecimal(20));
//		System.out.println("///////////////////////////deposito///////////////////");
//		depositoService.realizarDeposito("123", new BigDecimal(10));
//
//		System.out.println("///////////////////////////retiro///////////////////");
//		retiService.realizarRetiro("123", new BigDecimal(50));
		
		
	}
}
