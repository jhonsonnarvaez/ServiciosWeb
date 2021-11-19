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
@Table(name = "tbl_sucursales")
public class DatosSucursalesTienda implements Serializable {

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSucursal;

	private String codigoSucursal;
	private String direccionSucursal;
	private int estadoSucursal;

	@OneToMany(cascade = CascadeType.REFRESH, mappedBy = "fkSucursal")
	private List<Productos> listaProductos = new ArrayList<Productos>();

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "idTienda")
	private DatosTienda fkTienda;

	@OneToMany(cascade = CascadeType.REFRESH, mappedBy = "fkSucursal")
	private List<InformacionCliente> listaInformacionCliente = new ArrayList<InformacionCliente>();

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "idPropietario")
	private InformacionPropietario fkPropietario;

	public int getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}

	public String getCodigoSucursal() {
		return codigoSucursal;
	}

	public void setCodigoSucursal(String codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public String getDireccionSucursal() {
		return direccionSucursal;
	}

	public void setDireccionSucursal(String direccionSucursal) {
		this.direccionSucursal = direccionSucursal;
	}

	public int getEstadoSucursal() {
		return estadoSucursal;
	}

	public void setEstadoSucursal(int estadoSucursal) {
		this.estadoSucursal = estadoSucursal;
	}

	public List<Productos> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Productos> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public DatosTienda getFkTienda() {
		return fkTienda;
	}

	public void setFkTienda(DatosTienda fkTienda) {
		this.fkTienda = fkTienda;
	}

	public List<InformacionCliente> getListaInformacionCliente() {
		return listaInformacionCliente;
	}

	public void setListaInformacionCliente(List<InformacionCliente> listaInformacionCliente) {
		this.listaInformacionCliente = listaInformacionCliente;
	}

	public InformacionPropietario getFkPropietario() {
		return fkPropietario;
	}

	public void setFkPropietario(InformacionPropietario fkPropietario) {
		this.fkPropietario = fkPropietario;
	}

	@Override
	public String toString() {
		return "DatosSucursalesTienda [idSucursal=" + idSucursal + ", codigoSucursal=" + codigoSucursal
				+ ", direccionSucursal=" + direccionSucursal + ", estadoSucursal=" + estadoSucursal + ", fkTienda="
				+ fkTienda + ", fkPropietario=" + fkPropietario + "]";
	}

}
