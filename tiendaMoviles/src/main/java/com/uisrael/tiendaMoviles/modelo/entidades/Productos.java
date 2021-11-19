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
@Table(name = "tbl_productos")
public class Productos implements Serializable {

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProducto;

	private String codigoProducto;
	private String nombreProducto;
	private int stockProducto;
	private int estadoProducto;

	@OneToMany(cascade = CascadeType.REFRESH, mappedBy = "fkProducto")
	private List<DetalleVentaProductos> listaDetalleVentaProducto = new ArrayList<DetalleVentaProductos>();

	@OneToMany(cascade = CascadeType.REFRESH, mappedBy = "fkProducto")
	private List<DetalleIngresoProductos> listaDetalleIngresoProductos = new ArrayList<DetalleIngresoProductos>();

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "idSucursal")
	private DatosSucursalesTienda fkSucursal;

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getStockProducto() {
		return stockProducto;
	}

	public void setStockProducto(int stockProducto) {
		this.stockProducto = stockProducto;
	}

	public int getEstadoProducto() {
		return estadoProducto;
	}

	public void setEstadoProducto(int estadoProducto) {
		this.estadoProducto = estadoProducto;
	}

	public List<DetalleVentaProductos> getListaDetalleVentaProducto() {
		return listaDetalleVentaProducto;
	}

	public void setListaDetalleVentaProducto(List<DetalleVentaProductos> listaDetalleVentaProducto) {
		this.listaDetalleVentaProducto = listaDetalleVentaProducto;
	}

	public List<DetalleIngresoProductos> getListaDetalleIngresoProductos() {
		return listaDetalleIngresoProductos;
	}

	public void setListaDetalleIngresoProductos(List<DetalleIngresoProductos> listaDetalleIngresoProductos) {
		this.listaDetalleIngresoProductos = listaDetalleIngresoProductos;
	}

	public DatosSucursalesTienda getFkSucursal() {
		return fkSucursal;
	}

	public void setFkSucursal(DatosSucursalesTienda fkSucursal) {
		this.fkSucursal = fkSucursal;
	}

	@Override
	public String toString() {
		return "Productos [idProducto=" + idProducto + ", codigoProducto=" + codigoProducto + ", nombreProducto="
				+ nombreProducto + ", stockProducto=" + stockProducto + ", estadoProducto=" + estadoProducto
				+ ", fkSucursal=" + fkSucursal + "]";
	}

}
