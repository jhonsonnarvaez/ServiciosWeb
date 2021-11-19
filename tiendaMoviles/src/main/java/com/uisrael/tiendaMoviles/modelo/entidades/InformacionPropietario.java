package com.uisrael.tiendaMoviles.modelo.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_datospropietario")
public class InformacionPropietario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPropietario;

	private String nombrePropietario;
	private String apellidoPropietario;
	private String identificacionPropietario;
	private String telefonoPropietario;
	private String celularPropietario; // porque dos telefonos
	private String contrasenaPropietario;
	private String correoPropietario;
	private int estadoPropietario;

	@OneToMany(cascade = CascadeType.REFRESH, mappedBy = "fkPropietario")
	private List<DatosSucursalesTienda> listaDatosSucursalesTienda = new ArrayList<DatosSucursalesTienda>();

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "idIdentificacionPersona")
	private IdentificacionPersona fkIdentificacionPersona;

	public int getIdPropietario() {
		return idPropietario;
	}

	public void setIdPropietario(int idPropietario) {
		this.idPropietario = idPropietario;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	public String getApellidoPropietario() {
		return apellidoPropietario;
	}

	public void setApellidoPropietario(String apellidoPropietario) {
		this.apellidoPropietario = apellidoPropietario;
	}

	public String getIdentificacionPropietario() {
		return identificacionPropietario;
	}

	public void setIdentificacionPropietario(String identificacionPropietario) {
		this.identificacionPropietario = identificacionPropietario;
	}

	public String getTelefonoPropietario() {
		return telefonoPropietario;
	}

	public void setTelefonoPropietario(String telefonoPropietario) {
		this.telefonoPropietario = telefonoPropietario;
	}

	public String getCelularPropietario() {
		return celularPropietario;
	}

	public void setCelularPropietario(String celularPropietario) {
		this.celularPropietario = celularPropietario;
	}

	public String getContrasenaPropietario() {
		return contrasenaPropietario;
	}

	public void setContrasenaPropietario(String contrasenaPropietario) {
		this.contrasenaPropietario = contrasenaPropietario;
	}

	public int getEstadoPropietario() {
		return estadoPropietario;
	}

	public void setEstadoPropietario(int estadoPropietario) {
		this.estadoPropietario = estadoPropietario;
	}

	public List<DatosSucursalesTienda> getListaDatosSucursalesTienda() {
		return listaDatosSucursalesTienda;
	}

	public void setListaDatosSucursalesTienda(List<DatosSucursalesTienda> listaDatosSucursalesTienda) {
		this.listaDatosSucursalesTienda = listaDatosSucursalesTienda;
	}

	public IdentificacionPersona getFkIdentificacionPersona() {
		return fkIdentificacionPersona;
	}

	public void setFkIdentificacionPersona(IdentificacionPersona fkIdentificacionPersona) {
		this.fkIdentificacionPersona = fkIdentificacionPersona;
	}

	public String getCorreoPropietario() {
		return correoPropietario;
	}

	public void setCorreoPropietario(String correoPropietario) {
		this.correoPropietario = correoPropietario;
	}

	@Override
	public String toString() {
		return "InformacionPropietario [idPropietario=" + idPropietario + ", nombrePropietario=" + nombrePropietario
				+ ", apellidoPropietario=" + apellidoPropietario + ", identificacionPropietario="
				+ identificacionPropietario + ", telefonoPropietario=" + telefonoPropietario + ", celularPropietario="
				+ celularPropietario + ", contrasenaPropietario=" + contrasenaPropietario + ", correoPropietario="
				+ correoPropietario + ", estadoPropietario=" + estadoPropietario + ", fkIdentificacionPersona="
				+ fkIdentificacionPersona + "]";
	}

}
