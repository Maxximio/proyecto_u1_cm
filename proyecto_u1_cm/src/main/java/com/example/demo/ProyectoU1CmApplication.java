package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Estudiante;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1CmApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Estudiante e=new Estudiante();
		
		e.setNombre("Carlos");
		e.setApellido("Montalvo");
		e.setCedula("162343675465");
		
		estudService.insertarService(e);
		estudService.actualizarService(e);
		estudService.buscarService(e.getApellido());
		estudService.eliminarService(e.getCedula());
		
	}

}
