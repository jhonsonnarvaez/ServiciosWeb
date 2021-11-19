package com.uisrael.tiendaMoviles.modelo.dao.impl;

import com.uisrael.tiendaMoviles.modelo.dao.InformacionClienteDao;
import com.uisrael.tiendaMoviles.modelo.entidades.InformacionCliente;

public class InformacionClienteDaoImpl extends GenericaDaoImpl<InformacionCliente> implements InformacionClienteDao {

	@Override
	public void insertarCliente(InformacionCliente nuevoCliente) {

		this.beginTransaction();
		this.create(nuevoCliente);
		this.commit();
	}

}
