/**
 * 
 */
package com.pamela.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pamela.helpdesk.domain.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente,Integer>{
	

}
