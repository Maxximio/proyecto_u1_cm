package com.example.demo.independiente;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaA {

	private String paralelo;
	
	@Autowired
	private Colegio colegio;
	
	@Autowired
	private Estudiante estudiante;

	public String matricularA(String paralelo,String nombreCol, String ciudad
			,int numEstud,String nombre,int edad) {
		
		
		this.colegio.setNombre(nombreCol);
		this.colegio.setCiudad(ciudad);
		this.colegio.setNumEstudiantes(numEstud);
		
		this.estudiante.setNombre(nombre);
		this.estudiante.setEdad(edad);
		
		this.paralelo=paralelo;
		
		return "Matriculado an paralelo A";
	}
	
	//set y get
	
	public String getParalelo() {
		return paralelo;
	}

	public void setParalelo(String paralelo) {
		this.paralelo = paralelo;
	}

	public Colegio getColegio() {
		return colegio;
	}
	public void setColegio(Colegio colegio) {
		this.colegio = colegio;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}
	
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
}
