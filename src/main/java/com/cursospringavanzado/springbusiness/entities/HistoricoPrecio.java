package com.cursospringavanzado.springbusiness.entities;

import java.math.BigDecimal;
import java.util.Date;

public class HistoricoPrecio extends Producto {
	private Date fecha;
	private BigDecimal precio;
	
	public static HistoricoPrecio create(Integer id, String nombre, 
			String descripcion, 
			String codigoBarras, 
			Date fecha, 
			BigDecimal precio) {
		HistoricoPrecio prod = new HistoricoPrecio();
		prod.setId(id);
		prod.setNombre(nombre);
		prod.setDescripcion(descripcion);
		prod.setCodigoBarras(codigoBarras);
		prod.setFecha(fecha);
		prod.setPrecio(precio);
		return prod;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		String parent = super.toString();
		return parent + " HistoricoPrecio [fecha=" + fecha + ", precio=" + precio + "]";
	}
	
	
}
