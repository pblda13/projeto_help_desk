package com.pamela.helpdesk.resource;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	
	public ResponseEntity<List<TecnicoDTO>>findAll(){
		
		List<Tecnico> list = service.findAll(); 
		List<TecnicoDTO> listDTO = list.stream().map(obj -> new TecnicoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@PostMapping
	public ResponseEntity<TecnicoDTO> create(@RequestBody TecnicoDTO objDTO){
		Tecnico newObj = service.create(objDTO);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(null).build();
	}

}
