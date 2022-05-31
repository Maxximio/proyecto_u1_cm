package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.consultorio.CitaMedica;
import com.example.demo.consultorio.CitaMedica2;
import com.example.demo.independiente.MatriculaA;
import com.example.demo.independiente.MatriculaB;
import com.example.demo.independiente.MatriculaC;

@SpringBootApplication
public class ProyectoU1CmApplication implements CommandLineRunner{

	//@Autowired
	//private CitaMedica2 cita;
	
	@Autowired
	private MatriculaA matA;
	
	@Autowired
	private MatriculaB matB;
	
	@Autowired
	private MatriculaC matC;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("Mi primer proyecto STS");
//		
//		
//		//CitaMedica cita=new CitaMedica();
//		
//		String respuesta=cita.agendar(LocalDateTime.now(), "Carlos", "Montalvo",
//				30, "Cayambe", "Mateo", 21);
//		System.out.println(respuesta);
		
		
		//////////////////tarea 5//////////////////////////
		
		String resp1=matA.matricularA("A", "Colegio Ibarra", "Ibarra", 2000, "Juan", 16);
		System.out.println(resp1);
		
		
		String resp2=matB.matricularB("B", "Colegio Ibarra", "Ibarra", 2000, "Juan", 16);
		System.out.println(resp2);
		
		String resp3=matC.matricularC("C", "Colegio Ibarra", "Ibarra", 2000, "Juan", 16);
		System.out.println(resp3);
	}

}
