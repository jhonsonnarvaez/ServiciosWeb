package com.uisrael.tiendaMoviles.modelo.dao.impl;

import com.uisrael.tiendaMoviles.modelo.dao.CuentasVentaDao;
import com.uisrael.tiendaMoviles.modelo.entidades.CuentasVenta;

public class CuentasVentaDaoImpl extends GenericaDaoImpl<CuentasVenta> implements CuentasVentaDao {

	@Override
	public void insertarCuentaVenta(CuentasVenta nuevaCuentaVenta) {

		this.beginTransaction();
		this.create(nuevaCuentaVenta);
		this.commit();
	}

}
