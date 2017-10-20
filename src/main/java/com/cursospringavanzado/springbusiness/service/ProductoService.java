package com.cursospringavanzado.springbusiness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.cursospringavanzado.springbusiness.entities.Producto;
import com.cursospringavanzado.springbusiness.repositories.ProductoRepository;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ProductoService {

	@Autowired
	ProductoRepository productoRepository;
	
	public Producto[] getProductos() {
		return productoRepository.getProductos();
	}
	
	public Producto getProductoById(Integer id) throws DataIntegrityViolationException {
		return productoRepository.getById(id);
	}
}
