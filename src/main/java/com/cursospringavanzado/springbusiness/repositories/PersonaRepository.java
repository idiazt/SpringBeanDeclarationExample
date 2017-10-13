package com.cursospringavanzado.springbusiness.repositories;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityExistsException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.cursospringavanzado.springbusiness.entities.Persona;

@Repository
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class PersonaRepository {
	
	@Autowired
	Persona persona;
	@Autowired
	Persona persona2;

	public List<Persona> getPersonas() {
		persona.setId(1L);
		persona.setName("María");
		persona2.setId(2L);
		persona2.setName("Pedro");
		List<Persona> result = new ArrayList<Persona>();
		result.add(persona);
		result.add(persona2);
		return result;
	}

	public Persona getPersonaById(Long id) {
		persona.setId(1L);
		persona.setName("María");
		if (id.equals(1L))
			return persona;
		else throw new EntityExistsException("No encontrado");
	}

}
