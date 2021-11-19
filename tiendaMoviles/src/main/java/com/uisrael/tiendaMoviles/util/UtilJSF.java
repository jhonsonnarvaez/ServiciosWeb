package com.uisrael.tiendaMoviles.util;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

public class UtilJSF {
	protected FacesContext obtenerContexto() {
		return FacesContext.getCurrentInstance();
	}

	protected void ponerMensajeInfo(String mensaje) {
		anadirMensaje(mensaje, FacesMessage.SEVERITY_INFO);
	}

	protected void ponerMensajeError(String mensaje) {
		anadirMensaje(mensaje, FacesMessage.SEVERITY_ERROR);
	}

	private void anadirMensaje(String mensaje, Severity severity) {
		FacesMessage mensajeJSF = new FacesMessage();
		mensajeJSF.setSeverity(severity);
		mensajeJSF.setSummary(mensaje);
		obtenerContexto().addMessage(null, mensajeJSF);
	}

	protected HttpServletRequest getRequest() {
		return ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest());
	}
}
