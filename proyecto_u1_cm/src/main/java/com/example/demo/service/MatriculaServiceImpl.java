package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.example.demo.model.Estudiante;
import com.example.demo.model.Matricula;
import com.example.demo.model.ProfesorGeneral;
import com.example.demo.model.ProfesorMateria;
import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private IMatriculaRepository matriRepo;
	
	@Autowired
	private ProfesorGeneral general;
	
	@Autowired
	private ProfesorMateria materia;
	
	@Lookup
	public ProfesorGeneral obtenerProfesorG() {
		return null;
	}
	
	@Lookup
	public ProfesorMateria obtenerProfesorM() {
		ProfesorMateria profeM=new ProfesorMateria();
		profeM.setApellido("Tapia");
		profeM.setNombre("Jose");
		
		return profeM;
	}

	@Override
	public void insertarService(Matricula e) {
		System.out.println("---------------------");
		System.out.println("Di desde service SINGLLETON "+this.general);
		System.out.println("---------------------");
		System.out.println("Di desde service PROTOTYPE "+this.materia);
		
		System.out.println("General "+this.obtenerProfesorG());
		System.out.println("Materia "+this.obtenerProfesorM());
		
		this.matriRepo.insertar(e);
	}

	@Override
	public Matricula buscarService(String numero) {
		// TODO Auto-generated method stub
		return this.matriRepo.buscar(numero);
	}

	@Override
	public void actualizarService(Matricula e) {
		// TODO Auto-generated method stub
		this.matriRepo.actualizar(e);
	}

	@Override
	public void eliminarService(String numero) {
		// TODO Auto-generated method stub
		this.matriRepo.eliminar(numero);
	}
	
	

}
