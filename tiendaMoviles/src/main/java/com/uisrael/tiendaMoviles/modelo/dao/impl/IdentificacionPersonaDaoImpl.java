package com.uisrael.tiendaMoviles.modelo.dao.impl;

import com.uisrael.tiendaMoviles.modelo.dao.IdentificacionPersonaDao;
import com.uisrael.tiendaMoviles.modelo.entidades.IdentificacionPersona;

public class IdentificacionPersonaDaoImpl extends GenericaDaoImpl<IdentificacionPersona>
		implements IdentificacionPersonaDao {

	@Override
	public void insertarIdentificacionPersona(IdentificacionPersona nuevaIdentificacionPersona) {

		this.beginTransaction();
		this.create(nuevaIdentificacionPersona);
		this.commit();
	}

}
