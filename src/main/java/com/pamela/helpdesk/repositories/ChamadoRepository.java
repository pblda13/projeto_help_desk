/**
 * 
 */
package com.pamela.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pamela.helpdesk.domain.Chamado;


public interface ChamadoRepository extends JpaRepository<Chamado,Integer>{
	

}
