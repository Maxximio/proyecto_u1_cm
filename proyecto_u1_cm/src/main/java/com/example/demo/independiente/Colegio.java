package com.example.demo.independiente;

import org.springframework.stereotype.Component;

@Component
public class Colegio {

	private String nombre;
	private String ciudad;
	private int numEstudiantes;
	
	//set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getNumEstudiantes() {
		return numEstudiantes;
	}
	public void setNumEstudiantes(int numEstudiantes) {
		this.numEstudiantes = numEstudiantes;
	}
	
	
	
}
