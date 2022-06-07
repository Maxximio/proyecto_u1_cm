package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Estudiante;
import com.example.demo.model.Matricula;
import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private IMatriculaRepository matriRepo;

	@Override
	public void insertarService(Matricula e) {
		// TODO Auto-generated method stub
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
