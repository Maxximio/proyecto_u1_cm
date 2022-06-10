package com.example.demo.banco.repository;

import com.example.demo.banco.modelo.Retiro;

public interface IRetiroRepository {

	public void insertar (Retiro r);
	public Retiro buscar (String numeroRetiro);
	public void actualizar (Retiro r);
	public void eliminar (String numeroRetiro);
	
	
}
