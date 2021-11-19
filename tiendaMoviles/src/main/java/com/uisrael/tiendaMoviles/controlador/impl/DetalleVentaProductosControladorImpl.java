package com.uisrael.tiendaMoviles.controlador.impl;

import com.uisrael.tiendaMoviles.controlador.DetalleVentaProductosControlador;
import com.uisrael.tiendaMoviles.modelo.dao.DetalleVentaProductosDao;
import com.uisrael.tiendaMoviles.modelo.dao.impl.DetalleVentaProductosDaoImpl;
import com.uisrael.tiendaMoviles.modelo.entidades.DetalleVentaProductos;

public class DetalleVentaProductosControladorImpl implements DetalleVentaProductosControlador {

	private DetalleVentaProductosDao detalleVentaProductosDao;

	public DetalleVentaProductosControladorImpl() {

		detalleVentaProductosDao = new DetalleVentaProductosDaoImpl();
	}

	@Override
	public void insertarDetalleVenta(DetalleVentaProductos nuevoDetalleVenta) {
		detalleVentaProductosDao.insertarDetalleVenta(nuevoDetalleVenta);
	}

}
