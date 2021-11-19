package com.uisrael.tiendaMoviles.modelo.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_ventas")
public class VentaProductos implements Serializable {

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVenta;

	private double porcentajeIvaVenta;
	private double totalVenta;
	private int estadoVenta;

	@Temporal(TemporalType.DATE)
	private Date fechaVenta;

	@OneToMany(cascade = CascadeType.REFRESH, mappedBy = "fkVenta")
	private List<CuentasVenta> listaVentas = new ArrayList<CuentasVenta>();

	@OneToMany(cascade = CascadeType.REFRESH, mappedBy = "fkVenta")
	private List<DetalleVentaProductos> listaDetalleVentaProductos = new ArrayList<DetalleVentaProductos>();

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "idCliente")
	private InformacionCliente fkCliente;

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public double getPorcentajeIvaVenta() {
		return porcentajeIvaVenta;
	}

	public void setPorcentajeIvaVenta(double porcentajeIvaVenta) {
		this.porcentajeIvaVenta = porcentajeIvaVenta;
	}

	public double getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(double totalVenta) {
		this.totalVenta = totalVenta;
	}

	public int getEstadoVenta() {
		return estadoVenta;
	}

	public void setEstadoVenta(int estadoVenta) {
		this.estadoVenta = estadoVenta;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public InformacionCliente getFkCliente() {
		return fkCliente;
	}

	public void setFkCliente(InformacionCliente fkCliente) {
		this.fkCliente = fkCliente;
	}

	public List<CuentasVenta> getListaVentas() {
		return listaVentas;
	}

	public void setListaVentas(List<CuentasVenta> listaVentas) {
		this.listaVentas = listaVentas;
	}

	public List<DetalleVentaProductos> getListaDetalleVentaProductos() {
		return listaDetalleVentaProductos;
	}

	public void setListaDetalleVentaProductos(List<DetalleVentaProductos> listaDetalleVentaProductos) {
		this.listaDetalleVentaProductos = listaDetalleVentaProductos;
	}

	@Override
	public String toString() {
		return "VentaProductos [idVenta=" + idVenta + ", porcentajeIvaVenta=" + porcentajeIvaVenta + ", totalVenta="
				+ totalVenta + ", estadoVenta=" + estadoVenta + ", fechaVenta=" + fechaVenta + ", fkCliente="
				+ fkCliente + "]";
	}

}
