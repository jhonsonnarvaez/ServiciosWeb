package com.uisrael.tiendaMoviles.controlador;

import com.uisrael.tiendaMoviles.modelo.entidades.InformacionPropietario;

public interface InformacionPropietarioControlador {

	public void insertarInformacionPropietario(InformacionPropietario nuevoPropietario);
	
	public InformacionPropietario validarUsuario(String correo, String contrasena) throws Exception;

}
