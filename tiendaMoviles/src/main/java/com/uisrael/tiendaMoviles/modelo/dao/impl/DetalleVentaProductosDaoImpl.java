package com.uisrael.tiendaMoviles.modelo.dao.impl;

import com.uisrael.tiendaMoviles.modelo.dao.DetalleVentaProductosDao;
import com.uisrael.tiendaMoviles.modelo.entidades.DetalleVentaProductos;

public class DetalleVentaProductosDaoImpl extends GenericaDaoImpl<DetalleVentaProductos>
		implements DetalleVentaProductosDao {

	@Override
	public void insertarDetalleVenta(DetalleVentaProductos nuevoDetalleVenta) {

		this.beginTransaction();
		this.create(nuevoDetalleVenta);
		this.commit();
	}

}
