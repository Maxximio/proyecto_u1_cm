package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Estudiante;
import com.example.demo.model.Materia;
import com.example.demo.model.Matricula;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IMateriaService;
import com.example.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1CmApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudService;
	
	@Autowired
	private IMateriaService mateService;
	
	@Autowired
	private IMatriculaService matriService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("/////////////////Estudiante///////////////////");
		Estudiante e=new Estudiante();
		
		e.setNombre("Carlos");
		e.setApellido("Montalvo");
		e.setCedula("162343675465");
		
		estudService.insertarService(e);
		estudService.actualizarService(e);
		estudService.buscarService(e.getApellido());
		estudService.eliminarService(e.getCedula());
	
		System.out.println("/////////////////Materia///////////////////");
		Materia m=new Materia();
		m.setNombre("Ingles");
		m.setSemestre("4");
	
		mateService.insertarService(m);
		mateService.buscarService(m.getNombre());
		mateService.actualizarService(m);
		mateService.eliminarService(m.getNombre());
		
		System.out.println("/////////////////Matricula///////////////////");
		Matricula tri =new Matricula();
		tri.setEstudiante(e);
		List<Materia> misMaterias = new ArrayList<>(); 
		misMaterias.add(m);
		tri.setMateria(misMaterias);
		tri.setNumero("132546");
		
		matriService.insertarService(tri);
		matriService.buscarService(tri.getNumero());
		matriService.actualizarService(tri);
		matriService.eliminarService(tri.getNumero());
		
	}
}
