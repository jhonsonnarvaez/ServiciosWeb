package com.uisrael.tiendaMoviles.modelo.dao.impl;

import com.uisrael.tiendaMoviles.modelo.dao.VentaProductosDao;
import com.uisrael.tiendaMoviles.modelo.entidades.VentaProductos;

public class VentaProductosDaoImpl extends GenericaDaoImpl<VentaProductos> implements VentaProductosDao {

	@Override
	public void insertarVentaProducto(VentaProductos nuevaVentaProducto) {

		this.beginTransaction();
		this.create(nuevaVentaProducto);
		this.commit();
	}

}
