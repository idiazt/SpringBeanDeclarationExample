package com.cursospringavanzado.springbusiness.contextos;

public class ProfileServiceProduccion implements IProfileService {

	@Override
	public String mostrarRutaFicheroLog() {
		return "/produccion/fichero-log-produccion.log";
	}

}
