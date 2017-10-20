package com.cursospringavanzado.springbusiness.entities;

import java.util.LinkedHashSet;
import java.util.Set;

public class Cesta {
	private Integer id;
	private Set<Producto> productos = new LinkedHashSet<Producto>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Set<Producto> getProductos() {
		return productos;
	}
	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}
	
	@Override
	public String toString() {
		return "Cesta [id=" + id + ", productos=" + productos + "]";
	}
}
