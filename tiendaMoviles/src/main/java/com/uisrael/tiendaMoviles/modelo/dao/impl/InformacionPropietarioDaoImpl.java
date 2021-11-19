package com.uisrael.tiendaMoviles.modelo.dao.impl;

import javax.persistence.TypedQuery;

import com.uisrael.tiendaMoviles.modelo.dao.InformacionPropietarioDao;
import com.uisrael.tiendaMoviles.modelo.entidades.InformacionPropietario;

public class InformacionPropietarioDaoImpl extends GenericaDaoImpl<InformacionPropietario>
		implements InformacionPropietarioDao {

	@Override
	public void insertarInformacionPropietario(InformacionPropietario nuevoPropietario) {

		this.beginTransaction();
		this.create(nuevoPropietario);
		this.commit();
	}

	@Override
	public InformacionPropietario validarUsuario(String correo, String contrasena) throws Exception {
		InformacionPropietario usuario = null;
		try {
			TypedQuery<InformacionPropietario> query = this.entityManager.createQuery(
					"Select pro From InformacionPropietario pro where pro.correoPropietario =:paramCorreo and pro.contrasenaPropietario =:paramContrasena",
					InformacionPropietario.class);
			query.setParameter("paramCorreo", correo);
			query.setParameter("paramContrasena", contrasena);
			usuario = query.getSingleResult();
		} catch (Exception e) {
			throw new Exception("Usuario no encontrado");
		}
		return usuario;
	}

}
