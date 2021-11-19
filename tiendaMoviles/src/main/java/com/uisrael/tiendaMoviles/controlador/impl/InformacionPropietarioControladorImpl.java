package com.uisrael.tiendaMoviles.controlador.impl;

import com.uisrael.tiendaMoviles.controlador.InformacionPropietarioControlador;
import com.uisrael.tiendaMoviles.modelo.dao.InformacionPropietarioDao;
import com.uisrael.tiendaMoviles.modelo.dao.impl.InformacionPropietarioDaoImpl;
import com.uisrael.tiendaMoviles.modelo.entidades.InformacionPropietario;

public class InformacionPropietarioControladorImpl implements InformacionPropietarioControlador {

	private InformacionPropietarioDao informacionPropietarioDao;

	public InformacionPropietarioControladorImpl() {
		informacionPropietarioDao = new InformacionPropietarioDaoImpl();
	}

	@Override
	public void insertarInformacionPropietario(InformacionPropietario nuevoPropietario) {
		informacionPropietarioDao.insertarInformacionPropietario(nuevoPropietario);
	}

	@Override
	public InformacionPropietario validarUsuario(String correo, String contrasena) throws Exception {
		return informacionPropietarioDao.validarUsuario(correo, contrasena);
	}

}
