package com.uisrael.tiendaMoviles.controlador.impl;

import com.uisrael.tiendaMoviles.controlador.DetalleIngresoProductosControlador;
import com.uisrael.tiendaMoviles.modelo.dao.DetalleIngresoProductosDao;
import com.uisrael.tiendaMoviles.modelo.dao.impl.DetalleIngresoProductosDaoImpl;
import com.uisrael.tiendaMoviles.modelo.entidades.DetalleIngresoProductos;

public class DetalleIngresoProductosControladorImpl implements DetalleIngresoProductosControlador {

	private DetalleIngresoProductosDao detalleIngresoProductosDao;

	public DetalleIngresoProductosControladorImpl() {

		detalleIngresoProductosDao = new DetalleIngresoProductosDaoImpl();
	}

	@Override
	public void insertarDetalleIngreso(DetalleIngresoProductos nuevaDetalleIngreso) {
		detalleIngresoProductosDao.insertarDetalleIngreso(nuevaDetalleIngreso);
	}

}
