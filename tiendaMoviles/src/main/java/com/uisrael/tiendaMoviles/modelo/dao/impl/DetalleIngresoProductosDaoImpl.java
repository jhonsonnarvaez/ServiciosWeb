package com.uisrael.tiendaMoviles.modelo.dao.impl;

import com.uisrael.tiendaMoviles.modelo.dao.DetalleIngresoProductosDao;
import com.uisrael.tiendaMoviles.modelo.entidades.DetalleIngresoProductos;

public class DetalleIngresoProductosDaoImpl extends GenericaDaoImpl<DetalleIngresoProductos>
		implements DetalleIngresoProductosDao {

	@Override
	public void insertarDetalleIngreso(DetalleIngresoProductos nuevaDetalleIngreso) {

		this.beginTransaction();
		this.create(nuevaDetalleIngreso);
		this.commit();
	}

}
