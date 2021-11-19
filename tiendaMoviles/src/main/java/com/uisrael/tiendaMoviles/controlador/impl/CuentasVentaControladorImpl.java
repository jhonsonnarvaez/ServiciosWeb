package com.uisrael.tiendaMoviles.controlador.impl;

import com.uisrael.tiendaMoviles.controlador.CuentasVentaControlador;
import com.uisrael.tiendaMoviles.modelo.dao.CuentasVentaDao;
import com.uisrael.tiendaMoviles.modelo.dao.impl.CuentasVentaDaoImpl;
import com.uisrael.tiendaMoviles.modelo.entidades.CuentasVenta;

public class CuentasVentaControladorImpl implements CuentasVentaControlador {

	private CuentasVentaDao cuentasVentaDao;

	public CuentasVentaControladorImpl() {

		cuentasVentaDao = new CuentasVentaDaoImpl();
	}

	@Override
	public void insertarCuentaVenta(CuentasVenta nuevaCuentaVenta) {
		cuentasVentaDao.insertarCuentaVenta(nuevaCuentaVenta);
	}

}
