package com.uisrael.tiendaMoviles.controlador.impl;

import com.uisrael.tiendaMoviles.controlador.InformacionProveedorControlador;
import com.uisrael.tiendaMoviles.modelo.dao.InformacionProveedorDao;
import com.uisrael.tiendaMoviles.modelo.dao.impl.InformacionProveedorDaoImpl;
import com.uisrael.tiendaMoviles.modelo.entidades.InformacionProveedor;

public class InformacionProveedorControladorImpl implements InformacionProveedorControlador {

	private InformacionProveedorDao informacionProveedorDao;

	public InformacionProveedorControladorImpl() {
		informacionProveedorDao = new InformacionProveedorDaoImpl();
	}

	@Override
	public void insertarProveedor(InformacionProveedor nuevoProveedor) {
		informacionProveedorDao.insertarProveedor(nuevoProveedor);
	}

}
