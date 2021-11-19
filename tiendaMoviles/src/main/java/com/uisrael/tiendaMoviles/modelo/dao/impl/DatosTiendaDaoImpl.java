package com.uisrael.tiendaMoviles.modelo.dao.impl;

import com.uisrael.tiendaMoviles.modelo.dao.DatosTiendaDao;
import com.uisrael.tiendaMoviles.modelo.entidades.DatosTienda;

public class DatosTiendaDaoImpl extends GenericaDaoImpl<DatosTienda> implements DatosTiendaDao {

	@Override
	public void insertarTienda(DatosTienda nuevaTienda) {

		this.beginTransaction();
		this.create(nuevaTienda);
		this.commit();
	}

}
