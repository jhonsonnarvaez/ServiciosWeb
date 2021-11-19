package com.uisrael.tiendaMoviles.modelo.dao.impl;

import com.uisrael.tiendaMoviles.modelo.dao.CuentaPorCobrarDao;
import com.uisrael.tiendaMoviles.modelo.entidades.CuentaPorCobrar;

public class CuentaPorCobrarDaoImpl extends GenericaDaoImpl<CuentaPorCobrar> implements CuentaPorCobrarDao {

	@Override
	public void insertarCuentaPorCobrar(CuentaPorCobrar nuevaCuentaPorCobrar) {

		this.beginTransaction();
		this.create(nuevaCuentaPorCobrar);
		this.commit();
	}

}
