package com.uisrael.tiendaMoviles.modelo.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_identiPersona")
public class IdentificacionPersona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idIdentificacionPersona;

	private String codigoIdentificacionPersona;
	private String descripcionIdentificacionPersona;
	private int estadoIdentificacionPersona;

	@OneToMany(cascade = CascadeType.REFRESH, mappedBy = "fkIdentificacionPersona")
	private List<InformacionPropietario> listaInformacionPropietario = new ArrayList<InformacionPropietario>();

	@OneToMany(cascade = CascadeType.REFRESH, mappedBy = "fkIdentificacionPersona")
	private List<InformacionCliente> listaInformacionCliente = new ArrayList<InformacionCliente>();

	public int getIdIdentificacionPersona() {
		return idIdentificacionPersona;
	}

	public void setIdIdentificacionPersona(int idIdentificacionPersona) {
		this.idIdentificacionPersona = idIdentificacionPersona;
	}

	public String getCodigoIdentificacionPersona() {
		return codigoIdentificacionPersona;
	}

	public void setCodigoIdentificacionPersona(String codigoIdentificacionPersona) {
		this.codigoIdentificacionPersona = codigoIdentificacionPersona;
	}

	public String getDescripcionIdentificacionPersona() {
		return descripcionIdentificacionPersona;
	}

	public void setDescripcionIdentificacionPersona(String descripcionIdentificacionPersona) {
		this.descripcionIdentificacionPersona = descripcionIdentificacionPersona;
	}

	public int getEstadoIdentificacionPersona() {
		return estadoIdentificacionPersona;
	}

	public void setEstadoIdentificacionPersona(int estadoIdentificacionPersona) {
		this.estadoIdentificacionPersona = estadoIdentificacionPersona;
	}

	public List<InformacionPropietario> getListaInformacionPropietario() {
		return listaInformacionPropietario;
	}

	public void setListaInformacionPropietario(List<InformacionPropietario> listaInformacionPropietario) {
		this.listaInformacionPropietario = listaInformacionPropietario;
	}

	public List<InformacionCliente> getListaInformacionCliente() {
		return listaInformacionCliente;
	}

	public void setListaInformacionCliente(List<InformacionCliente> listaInformacionCliente) {
		this.listaInformacionCliente = listaInformacionCliente;
	}

	@Override
	public String toString() {
		return "IdentificacionPersona [idIdentificacionPersona=" + idIdentificacionPersona
				+ ", codigoIdentificacionPersona=" + codigoIdentificacionPersona + ", descripcionIdentificacionPersona="
				+ descripcionIdentificacionPersona + ", estadoIdentificacionPersona=" + estadoIdentificacionPersona
				+ "]";
	}

}
