package com.springavanzado.test.declaration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cursospringavanzado.springbusiness.service.CestaService;
import com.cursospringavanzado.springbusiness.service.ProductoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml", "classpath:spring-jpa.xml" })
public class CestaBeanDeclarationTest {
	@Autowired
	CestaService cestaService;
	@Autowired
	ProductoService productoService;
	
	@Test
	public void testPersonasCreadas() throws Exception {
		Assert.assertEquals(productoService.getProductos().length, 5);
		productoService.getProductos().toString();
		Assert.assertEquals(productoService.getProductoById(1).getNombre(), "Nombre: 1");
		cestaService.addProductoACesta(0, productoService.getProductoById(2));
		cestaService.addProductoACesta(0, productoService.getProductoById(3));
		cestaService.addProductoACesta(1, productoService.getProductoById(1));
		cestaService.addProductoACesta(1, productoService.getProductoById(4));
		System.out.println(cestaService.verProductosCesta(1));
		System.out.println(cestaService.verProductosCesta(2));
		Assert.assertEquals(cestaService.getCesta(1).getProductos().size(), 2);
	}
}
