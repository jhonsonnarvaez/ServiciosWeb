package com.uisrael.tiendaMoviles.modelo.dao.impl;

import com.uisrael.tiendaMoviles.modelo.dao.InformacionProveedorDao;
import com.uisrael.tiendaMoviles.modelo.entidades.InformacionProveedor;

public class InformacionProveedorDaoImpl extends GenericaDaoImpl<InformacionProveedor>
		implements InformacionProveedorDao {

	@Override
	public void insertarProveedor(InformacionProveedor nuevoProveedor) {

		this.beginTransaction();
		this.create(nuevoProveedor);
		this.commit();
	}

}
