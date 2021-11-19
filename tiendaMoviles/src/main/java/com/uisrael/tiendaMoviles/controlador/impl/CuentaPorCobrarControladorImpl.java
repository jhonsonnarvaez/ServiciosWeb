package com.uisrael.tiendaMoviles.controlador.impl;

import com.uisrael.tiendaMoviles.controlador.CuentaPorCobrarControlador;
import com.uisrael.tiendaMoviles.modelo.dao.CuentaPorCobrarDao;
import com.uisrael.tiendaMoviles.modelo.dao.impl.CuentaPorCobrarDaoImpl;
import com.uisrael.tiendaMoviles.modelo.entidades.CuentaPorCobrar;

public class CuentaPorCobrarControladorImpl implements CuentaPorCobrarControlador {

	private CuentaPorCobrarDao cuentaPorCobrarDao;

	public CuentaPorCobrarControladorImpl() {

		cuentaPorCobrarDao = new CuentaPorCobrarDaoImpl();
	}

	@Override
	public void insertarCuentaPorCobrar(CuentaPorCobrar nuevaCuentaPorCobrar) {
		cuentaPorCobrarDao.insertarCuentaPorCobrar(nuevaCuentaPorCobrar);
	}

}
