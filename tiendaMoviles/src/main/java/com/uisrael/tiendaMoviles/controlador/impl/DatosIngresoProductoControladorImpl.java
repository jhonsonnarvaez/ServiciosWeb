package com.uisrael.tiendaMoviles.controlador.impl;

import com.uisrael.tiendaMoviles.controlador.DatosIngresoProductoControlador;
import com.uisrael.tiendaMoviles.modelo.dao.DatosIngresoProductoDao;
import com.uisrael.tiendaMoviles.modelo.dao.impl.DatosIngresoProductoDaoImpl;
import com.uisrael.tiendaMoviles.modelo.entidades.DatosIngresoProducto;

public class DatosIngresoProductoControladorImpl implements DatosIngresoProductoControlador {

	private DatosIngresoProductoDao datosIngresoProductoDao;

	public DatosIngresoProductoControladorImpl() {

		datosIngresoProductoDao = new DatosIngresoProductoDaoImpl();
	}

	@Override
	public void insertarIngreso(DatosIngresoProducto nuevaIngreso) {
		datosIngresoProductoDao.insertarIngreso(nuevaIngreso);
	}

}
