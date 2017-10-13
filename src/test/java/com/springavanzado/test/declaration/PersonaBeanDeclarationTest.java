package com.springavanzado.test.declaration;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cursospringavanzado.springbusiness.entities.Persona;
import com.cursospringavanzado.springbusiness.service.PersonaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml", "classpath:spring-jpa.xml" })
public class PersonaBeanDeclarationTest {
	@Autowired
	PersonaService personaService;
	
	@Test(expected = DataIntegrityViolationException.class)
	public void testPersonasCreadas() throws Exception {
		List<Persona> personas = personaService.getPersonas();
		Assert.assertEquals(personas.size(), 2);
		for (Persona persona : personas) {
			if (persona.getId().equals(1L))
				Assert.assertEquals(persona.getName(), "María");
		}
		Assert.assertEquals(personaService.getPersonaById(1L).getName(), "María");
		personaService.getPersonaById(2L);
	}
}
