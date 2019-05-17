package com.puglielli.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puglielli.cursomc.domain.Estado;
import com.puglielli.cursomc.repositories.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private  EstadoRepository repo;
	
	public List<Estado> findAll(){
		return repo.findAllByOrderByNome();
	}
	
}
