package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Estudiante;
import com.example.demo.model.Materia;
import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.IMateriaRepository;

@Service
public class MateriaServiceImpl implements IMateriaService{

	@Autowired
	private IMateriaRepository materiaRepo;

	@Override
	public void insertarService(Materia e) {
		this.materiaRepo.insertar(e);
	}

	@Override
	public Materia buscarService(String nombre) {
		// TODO Auto-generated method stub
		return this.materiaRepo.buscar(nombre);
	}

	@Override
	public void actualizarService(Materia e) {
		// TODO Auto-generated method stub
		this.materiaRepo.actualizar(e);
	}

	@Override
	public void eliminarService(String nombre) {
		// TODO Auto-generated method stub
		this.materiaRepo.eliminar(nombre);
	}
	
	

}
