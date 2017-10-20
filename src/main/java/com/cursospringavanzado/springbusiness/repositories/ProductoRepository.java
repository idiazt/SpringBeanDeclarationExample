package com.cursospringavanzado.springbusiness.repositories;

import java.math.BigDecimal;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.cursospringavanzado.springbusiness.entities.Producto;

@Repository
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ProductoRepository {
	
	private static Producto[] productos = new Producto[5];
	
	@PostConstruct
	public void llenarProductos() {
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				productos[i] = 
					Producto.create(i, 
							"Nombre: " + i, 
							"Desc: " + i, 
							"COD: " + i);
			} else {
				productos[i] = 
						Producto.create(i, 
								"Nombre: " + i, 
								"Desc: " + i, 
								"COD: " + i,
								new Date(),
								new BigDecimal(i));
			}
		}
		
	}
	
	public Producto getById(Integer id) {
		return productos[id];
	}
	
	public Producto[] getProductos() {
		return productos;
	}
}
