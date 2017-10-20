package com.cursospringavanzado.springbusiness.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.cursospringavanzado.springbusiness.entities.Cesta;
import com.cursospringavanzado.springbusiness.entities.Producto;
import com.cursospringavanzado.springbusiness.repositories.ProductoRepository;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CestaService {

	public static final int MAX_NUM_CESTAS = 2;
	
	@Autowired
	ProductoRepository productoRepository;
	
	Cesta[] cestas = new Cesta[MAX_NUM_CESTAS];
	
	@PostConstruct
	public void initCestas() {
		for (int i = 0; i < MAX_NUM_CESTAS; i++) {
			cestas[i] = new Cesta();
			cestas[i].setId(1);
		}
	}
	
	public void addProductoACesta(Integer idCesta, Producto p) {
		cestas[idCesta].getProductos().add(p);
	}
	
	public String verProductosCesta(Integer idCesta) {
		return cestas[idCesta].toString();
	}
	
	public Cesta getCesta(Integer id) {
		for (int i = 0; i < MAX_NUM_CESTAS; i++) {
			if (cestas[i].getId().equals(id))
				return cestas[i];
		}
		throw new DataIntegrityViolationException("Cesta no encontrada");
	}
	
}
