package com.uisrael.tiendaMoviles.controlador.impl;

import com.uisrael.tiendaMoviles.controlador.DatosSucursalesTiendaControlador;
import com.uisrael.tiendaMoviles.modelo.dao.DatosSucursalesTiendaDao;
import com.uisrael.tiendaMoviles.modelo.dao.impl.DatosSucursalesTiendaDaoImpl;
import com.uisrael.tiendaMoviles.modelo.entidades.DatosSucursalesTienda;

public class DatosSucursalesTiendaControladorImpl implements DatosSucursalesTiendaControlador {

	private DatosSucursalesTiendaDao datosSucursalesTiendaDao;

	public DatosSucursalesTiendaControladorImpl() {

		datosSucursalesTiendaDao = new DatosSucursalesTiendaDaoImpl();
	}

	@Override
	public void insertarSucursal(DatosSucursalesTienda nuevaSucursal) {
		datosSucursalesTiendaDao.insertarSucursal(nuevaSucursal);
	}

}
