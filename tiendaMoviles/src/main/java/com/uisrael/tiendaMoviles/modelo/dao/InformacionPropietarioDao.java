package com.uisrael.tiendaMoviles.modelo.dao;

import com.uisrael.tiendaMoviles.modelo.entidades.InformacionPropietario;

public interface InformacionPropietarioDao {

	public void insertarInformacionPropietario(InformacionPropietario nuevoPropietario);

	public InformacionPropietario validarUsuario(String correo, String contrasena) throws Exception;

}
