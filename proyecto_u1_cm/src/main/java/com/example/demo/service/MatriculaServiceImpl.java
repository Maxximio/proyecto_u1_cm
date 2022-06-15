package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Override
	public void insertarService(Matricula e) {
		System.out.println("---------------------");
		System.out.println("Di desde service SINGLLETON "+this.general);
		System.out.println("---------------------");
		System.out.println("Di desde service PROTOTYPE "+this.materia);
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
