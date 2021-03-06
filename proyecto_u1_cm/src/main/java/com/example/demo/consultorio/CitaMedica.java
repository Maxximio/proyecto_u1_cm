package com.example.demo.consultorio;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class CitaMedica {

	private LocalDateTime fechaCita;
	
	//@Autowired
	private Doctor doctor;
	//@Autowired
	private Paciente paciente;
	
	public CitaMedica(Doctor doctor, Paciente paciente) {
		this.doctor = doctor;
		this.paciente = paciente;
	}

	public String agendar(LocalDateTime fechaCita,String nombreD, String apellidoD,
			int edad, String ciudadD,String nombrePac,int edadPaci) {
		
		
		this.doctor.setNombre(nombreD);
		this.doctor.setApellido(apellidoD);
		this.doctor.setEdad(edad);
		this.doctor.setCiudad(ciudadD);
		
		this.paciente.setNombre(nombrePac);
		this.paciente.setEdad(edadPaci);
		
		//seteamos los atributos de la cita medica
		this.fechaCita=fechaCita;
		
		//se guarda la cita en DB
		return "Cita Agendada";
	}
	
	//set y get
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	
	
}
