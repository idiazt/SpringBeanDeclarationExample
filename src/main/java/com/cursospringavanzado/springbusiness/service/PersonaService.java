package com.cursospringavanzado.springbusiness.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.cursospringavanzado.springbusiness.entities.Persona;
import com.cursospringavanzado.springbusiness.repositories.PersonaRepository;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class PersonaService {

	@Autowired
	PersonaRepository personaRepository;
	
	public List<Persona> getPersonas() {
		return personaRepository.getPersonas();
	}
	
	public Persona getPersonaById(Long id) throws DataIntegrityViolationException {
		return personaRepository.getPersonaById(id);
	}
}
