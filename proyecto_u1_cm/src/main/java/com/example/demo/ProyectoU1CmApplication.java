package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.consultorio.CitaMedica;
import com.example.demo.consultorio.CitaMedica2;

@SpringBootApplication
public class ProyectoU1CmApplication implements CommandLineRunner{

	@Autowired
	private CitaMedica2 cita;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto STS");
		
		
		//CitaMedica cita=new CitaMedica();
		
		String respuesta=cita.agendar(LocalDateTime.now(), "Carlos", "Montalvo",
				30, "Cayambe", "Mateo", 21);
		System.out.println(respuesta);
	}

}
