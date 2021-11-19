package com.uisrael.tiendaMoviles.modelo.dao.impl;

import com.uisrael.tiendaMoviles.modelo.dao.DatosSucursalesTiendaDao;
import com.uisrael.tiendaMoviles.modelo.entidades.DatosSucursalesTienda;

public class DatosSucursalesTiendaDaoImpl extends GenericaDaoImpl<DatosSucursalesTienda>
		implements DatosSucursalesTiendaDao {

	@Override
	public void insertarSucursal(DatosSucursalesTienda nuevaSucursal) {

		this.beginTransaction();
		this.create(nuevaSucursal);
		this.commit();
	}

}
