package com.uisrael.tiendaMoviles.controlador.impl;

import com.uisrael.tiendaMoviles.controlador.VentaProductosControlador;
import com.uisrael.tiendaMoviles.modelo.dao.VentaProductosDao;
import com.uisrael.tiendaMoviles.modelo.dao.impl.VentaProductosDaoImpl;
import com.uisrael.tiendaMoviles.modelo.entidades.VentaProductos;

public class VentaProductosControladorImpl implements VentaProductosControlador {

	private VentaProductosDao ventaProductosDao;

	public VentaProductosControladorImpl() {
		ventaProductosDao = new VentaProductosDaoImpl();
	}

	@Override
	public void insertarVentaProducto(VentaProductos nuevaVentaProducto) {
		ventaProductosDao.insertarVentaProducto(nuevaVentaProducto);
	}

}
