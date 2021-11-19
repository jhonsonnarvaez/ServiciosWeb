package com.uisrael.tiendaMoviles.controlador.impl;

import com.uisrael.tiendaMoviles.controlador.InformacionClienteControlador;
import com.uisrael.tiendaMoviles.modelo.dao.InformacionClienteDao;
import com.uisrael.tiendaMoviles.modelo.dao.impl.InformacionClienteDaoImpl;
import com.uisrael.tiendaMoviles.modelo.entidades.InformacionCliente;

public class InformacionClienteControladorImpl implements InformacionClienteControlador {

	private InformacionClienteDao informacionClienteDao;

	public InformacionClienteControladorImpl() {
		informacionClienteDao = new InformacionClienteDaoImpl();
	}

	@Override
	public void insertarCliente(InformacionCliente nuevoCliente) {
		informacionClienteDao.insertarCliente(nuevoCliente);
	}

}
