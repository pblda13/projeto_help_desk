package com.pamela.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pamela.helpdesk.domain.Chamado;
import com.pamela.helpdesk.domain.Cliente;
import com.pamela.helpdesk.domain.Tecnico;
import com.pamela.helpdesk.domain.enums.Perfil;
import com.pamela.helpdesk.domain.enums.Prioridade;
import com.pamela.helpdesk.domain.enums.Status;
import com.pamela.helpdesk.repositories.ChamadoRepository;
import com.pamela.helpdesk.repositories.ClienteRepository;
import com.pamela.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;

	
	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null,"Valdir Cezar","63653230268","valdir@gmail.com","123");
		tec1.addPerfil(Perfil.ADMIN);
		
		
		Cliente cli1 = new Cliente(null,"Linus Torvaldo","80527954780","torvaz@gmail.com","123");
		
		
		Chamado c1 = new Chamado(null,Prioridade.MEDIA,Status.ANDAMENTO,"Chamado 01","Primeiro chamado",tec1,cli1);
		
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
	}
}
