package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Estudiante;
import com.example.demo.repository.IEstudianteRepository;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

	@Autowired
	private IEstudianteRepository estuRepo;
	
	@Override
	public void insertarService(Estudiante e) {
		// TODO Auto-generated method stub
		this.estuRepo.insertar(e);
	}

	@Override
	public Estudiante buscarService(String apellido) {
		// TODO Auto-generated method stub
		return this.estuRepo.buscar(apellido);
	}

	@Override
	public void actualizarService(Estudiante e) {
		// TODO Auto-generated method stub
		this.estuRepo.actualizar(e);
	}

	@Override
	public void eliminarService(String cedula) {
		// TODO Auto-generated method stub
		this.estuRepo.eliminar(cedula);
	}

}
