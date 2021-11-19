package com.uisrael.tiendaMoviles.vista;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.uisrael.tiendaMoviles.controlador.InformacionPropietarioControlador;
import com.uisrael.tiendaMoviles.controlador.impl.InformacionPropietarioControladorImpl;
import com.uisrael.tiendaMoviles.modelo.entidades.InformacionPropietario;
import com.uisrael.tiendaMoviles.util.Log;
import com.uisrael.tiendaMoviles.util.UtilJSF;

@ManagedBean
@SessionScoped
public class LoginVista extends UtilJSF implements Serializable {

	private static final long serialVersionUID = 1L;

	private String correo;
	private String contrasena;
	private InformacionPropietario usuario;
	private InformacionPropietarioControlador informacionPropietarioControlador;

	public LoginVista() {
		informacionPropietarioControlador = new InformacionPropietarioControladorImpl();
		usuario = new InformacionPropietario();
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public InformacionPropietario getUsuario() {
		return usuario;
	}

	public void setUsuario(InformacionPropietario usuario) {
		this.usuario = usuario;
	}

	public void validarUsuario() {
		try {
			String url = getRequest().getContextPath() + "/inicio.xhtml";
			usuario = informacionPropietarioControlador.validarUsuario(correo, contrasena);
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usuario);
			FacesContext.getCurrentInstance().getExternalContext().redirect(url);

		} catch (Exception e) {
			ponerMensajeError(e.getMessage());
			Log.error(LoginVista.class.getName(), e.getMessage(), e);
		}
	}

	public void cerrarSesionUsuario() {
		try {
			String url = getRequest().getContextPath() + "/login.xhtml";
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().clear();
			FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
			FacesContext.getCurrentInstance().getExternalContext().redirect(url);
		} catch (Exception e) {
			ponerMensajeError("Error al cerrar la sesión");
			Log.error(LoginVista.class.getName(), "Error al cerrar la sesión", e);
		}
	}
}
