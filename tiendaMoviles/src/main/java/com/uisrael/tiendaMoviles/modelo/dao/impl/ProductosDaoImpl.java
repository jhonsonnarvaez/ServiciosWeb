package com.uisrael.tiendaMoviles.modelo.dao.impl;

import com.uisrael.tiendaMoviles.modelo.dao.ProductosDao;
import com.uisrael.tiendaMoviles.modelo.entidades.Productos;

public class ProductosDaoImpl extends GenericaDaoImpl<Productos> implements ProductosDao {

	@Override
	public void insertarProducto(Productos nuevoProducto) {

		this.beginTransaction();
		this.create(nuevoProducto);
		this.commit();
	}

}
