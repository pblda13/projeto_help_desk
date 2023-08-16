/**
 * 
 */
package com.pamela.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.pamela.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico,Integer>{
	

}
