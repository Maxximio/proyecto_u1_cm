package com.example.demo.independiente;


import org.springframework.stereotype.Service;

@Service
public class MatriculaB {

	private String paralelo;
	
	private Colegio colegio;
	private Estudiante estudiante;
	
	public MatriculaB(Colegio colegio, Estudiante estudiante) {
		this.colegio = colegio;
		this.estudiante = estudiante;
	}

	public String matricularB(String paralelo,String nombreCol, String ciudad
			,int numEstud,String nombre,int edad) {
		
		
		this.colegio.setNombre(nombreCol);
		this.colegio.setCiudad(ciudad);
		this.colegio.setNumEstudiantes(numEstud);
		
		this.estudiante.setNombre(nombre);
		this.estudiante.setEdad(edad);
		
		this.paralelo=paralelo;
		
		return "Matriculado an paralelo B";
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
