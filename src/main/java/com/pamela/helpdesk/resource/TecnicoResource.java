package com.pamela.helpdesk.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pamela.helpdesk.domain.Tecnico;
import com.pamela.helpdesk.domain.dto.TecnicoDTO;
import com.pamela.helpdesk.services.tecnicoService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/tecnicos")
public class TecnicoResource {
	
	@Autowired
	private tecnicoService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<TecnicoDTO> findById(@PathVariable Integer id) throws ObjectNotFoundException{	
		Tecnico obj = service.findById(id);
		return ResponseEntity.ok().body(new TecnicoDTO(obj));
	}
	
	

}
