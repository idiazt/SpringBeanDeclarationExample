package com.cursospringavanzado.springbusiness.entities;

import java.math.BigDecimal;
import java.util.Date;

public class Producto {
	private Integer id;
	private String nombre;
	private String descripcion;
	private String codigoBarras;
	
	protected Producto() {
		
	}
	
	public static Producto create(Integer id, String nombre, 
			String descripcion, String codigoBarras) {
		Producto producto = new Producto();
		producto.setId(id);
		producto.setNombre(nombre);
		producto.setDescripcion(descripcion);
		producto.setCodigoBarras(codigoBarras);
		return producto;
	}
	
	public static Producto create(Integer id, String nombre, 
			String descripcion, 
			String codigoBarras, 
			Date fecha, 
			BigDecimal precio) {
		HistoricoPrecio producto = HistoricoPrecio.create(id, 
				nombre, 
				descripcion, 
				codigoBarras, fecha, precio);
		return producto;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", codigoBarras="
				+ codigoBarras + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoBarras == null) ? 0 : codigoBarras.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (codigoBarras == null) {
			if (other.codigoBarras != null)
				return false;
		} else if (!codigoBarras.equals(other.codigoBarras))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}
