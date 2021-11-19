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
@Table(name = "tbl_cliente")
public class InformacionCliente implements Serializable {

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;

	private String nombreCliente;
	private String apellidoCliente;
	private String identificacionCliente;
	private String direccionCliente;
	private String telefonoCliente;
	private String celularCliente; // porque dos telefonos
	private String correoCliente;
	private int estadoCliente;

	@OneToMany(cascade = CascadeType.REFRESH, mappedBy = "fkCliente")
	private List<VentaProductos> listaVentaProductos = new ArrayList<VentaProductos>();

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "idSucursal")
	private DatosSucursalesTienda fkSucursal;

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "idIdentificacionPersona")
	private IdentificacionPersona fkIdentificacionPersona;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public String getIdentificacionCliente() {
		return identificacionCliente;
	}

	public void setIdentificacionCliente(String identificacionCliente) {
		this.identificacionCliente = identificacionCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public String getTelefonoCliente() {
		return telefonoCliente;
	}

	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	public String getCelularCliente() {
		return celularCliente;
	}

	public void setCelularCliente(String celularCliente) {
		this.celularCliente = celularCliente;
	}

	public String getCorreoCliente() {
		return correoCliente;
	}

	public void setCorreoCliente(String correoCliente) {
		this.correoCliente = correoCliente;
	}

	public int getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(int estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

	public List<VentaProductos> getListaVentaProductos() {
		return listaVentaProductos;
	}

	public void setListaVentaProductos(List<VentaProductos> listaVentaProductos) {
		this.listaVentaProductos = listaVentaProductos;
	}

	public DatosSucursalesTienda getFkSucursal() {
		return fkSucursal;
	}

	public void setFkSucursal(DatosSucursalesTienda fkSucursal) {
		this.fkSucursal = fkSucursal;
	}

	public IdentificacionPersona getFkIdentificacionPersona() {
		return fkIdentificacionPersona;
	}

	public void setFkIdentificacionPersona(IdentificacionPersona fkIdentificacionPersona) {
		this.fkIdentificacionPersona = fkIdentificacionPersona;
	}

	@Override
	public String toString() {
		return "InformacionCliente [idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", apellidoCliente="
				+ apellidoCliente + ", identificacionCliente=" + identificacionCliente + ", direccionCliente="
				+ direccionCliente + ", telefonoCliente=" + telefonoCliente + ", celularCliente=" + celularCliente
				+ ", correoCliente=" + correoCliente + ", estadoCliente=" + estadoCliente + ", fkSucursal=" + fkSucursal
				+ ", fkIdentificacionPersona=" + fkIdentificacionPersona + "]";
	}

}
