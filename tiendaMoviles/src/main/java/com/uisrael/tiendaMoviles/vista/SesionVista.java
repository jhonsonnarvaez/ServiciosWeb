package com.uisrael.tiendaMoviles.vista;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.uisrael.tiendaMoviles.modelo.entidades.InformacionPropietario;
import com.uisrael.tiendaMoviles.util.UtilJSF;

@ManagedBean
@ViewScoped
public class SesionVista extends UtilJSF implements Serializable {

	private static final long serialVersionUID = 1L;

	public void verificarSesion() {
		try {
			FacesContext context = FacesContext.getCurrentInstance();
			InformacionPropietario usuario = (InformacionPropietario) context.getExternalContext().getSessionMap()
					.get("usuario");
			String url = getRequest().getContextPath() + "/login.xhtml";
			if (usuario == null) {
				context.getExternalContext().redirect(url);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
