/**
 * 
 */
package com.pamela.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pamela.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa,Integer>{
	

}
