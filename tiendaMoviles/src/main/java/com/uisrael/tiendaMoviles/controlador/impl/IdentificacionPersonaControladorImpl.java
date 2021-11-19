package com.uisrael.tiendaMoviles.controlador.impl;

import com.uisrael.tiendaMoviles.controlador.IdentificacionPersonaControlador;
import com.uisrael.tiendaMoviles.modelo.dao.IdentificacionPersonaDao;
import com.uisrael.tiendaMoviles.modelo.dao.impl.IdentificacionPersonaDaoImpl;
import com.uisrael.tiendaMoviles.modelo.entidades.IdentificacionPersona;

public class IdentificacionPersonaControladorImpl implements IdentificacionPersonaControlador {

	private IdentificacionPersonaDao identificacionPersonaDao;

	public IdentificacionPersonaControladorImpl() {

		identificacionPersonaDao = new IdentificacionPersonaDaoImpl();
	}

	@Override
	public void insertarIdentificacionPersona(IdentificacionPersona nuevaIdentificacionPersona) {
		identificacionPersonaDao.insertarIdentificacionPersona(nuevaIdentificacionPersona);
	}

}
