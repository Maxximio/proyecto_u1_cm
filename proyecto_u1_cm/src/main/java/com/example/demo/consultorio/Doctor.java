package com.example.demo.consultorio;

import org.springframework.stereotype.Component;

//les voy a poner una metadadta
@Component
public class Doctor {

	private String nombre;
	private String apellido;
	private int edad;
	private String ciudad;
	
	//set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int i) {
		this.edad = i;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
}
