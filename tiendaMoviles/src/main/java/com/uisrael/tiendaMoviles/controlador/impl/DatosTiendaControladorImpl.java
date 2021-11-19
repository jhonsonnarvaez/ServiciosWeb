package com.uisrael.tiendaMoviles.controlador.impl;

import com.uisrael.tiendaMoviles.controlador.DatosTiendaControlador;
import com.uisrael.tiendaMoviles.modelo.dao.DatosTiendaDao;
import com.uisrael.tiendaMoviles.modelo.dao.impl.DatosTiendaDaoImpl;
import com.uisrael.tiendaMoviles.modelo.entidades.DatosTienda;

public class DatosTiendaControladorImpl implements DatosTiendaControlador {

	private DatosTiendaDao datosTiendaDao;

	public DatosTiendaControladorImpl() {

		datosTiendaDao = new DatosTiendaDaoImpl();
	}

	@Override
	public void insertarTienda(DatosTienda nuevaTienda) {
		datosTiendaDao.insertarTienda(nuevaTienda);
	}

}
