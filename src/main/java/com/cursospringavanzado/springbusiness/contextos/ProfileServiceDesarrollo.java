package com.cursospringavanzado.springbusiness.contextos;

public class ProfileServiceDesarrollo implements IProfileService {

	@Override
	public String mostrarRutaFicheroLog() {
		return "/desarrollo/fichero-log.log";
	}

}
