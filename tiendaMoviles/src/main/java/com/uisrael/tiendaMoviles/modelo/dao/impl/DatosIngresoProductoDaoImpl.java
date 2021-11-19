package com.uisrael.tiendaMoviles.modelo.dao.impl;

import com.uisrael.tiendaMoviles.modelo.dao.DatosIngresoProductoDao;
import com.uisrael.tiendaMoviles.modelo.entidades.DatosIngresoProducto;

public class DatosIngresoProductoDaoImpl extends GenericaDaoImpl<DatosIngresoProducto>
		implements DatosIngresoProductoDao {

	@Override
	public void insertarIngreso(DatosIngresoProducto nuevaIngreso) {

		this.beginTransaction();
		this.create(nuevaIngreso);
		this.commit();
	}

}
