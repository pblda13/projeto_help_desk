package com.pamela.helpdesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pamela.helpdesk.domain.Tecnico;
import com.pamela.helpdesk.repositories.TecnicoRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class tecnicoService {

	
	@Autowired
	private TecnicoRepository repository;
	
	
	public Tecnico findById(Integer id) throws ObjectNotFoundException  {
		Optional<Tecnico>obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id " + id));
	}
}
