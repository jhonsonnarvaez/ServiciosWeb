package com.uisrael.tiendaMoviles.modelo.entidades;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_detalleventa")
public class DetalleVentaProductos implements Serializable {

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetalleVenta;

	private double cantidad;
	private double precioVenta;
	private double descuentoVenta;

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "idVenta")
	private VentaProductos fkVenta;

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "idProducto")
	private Productos fkProducto;

	public int getIdDetalleVenta() {
		return idDetalleVenta;
	}

	public void setIdDetalleVenta(int idDetalleVenta) {
		this.idDetalleVenta = idDetalleVenta;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public double getDescuentoVenta() {
		return descuentoVenta;
	}

	public void setDescuentoVenta(double descuentoVenta) {
		this.descuentoVenta = descuentoVenta;
	}

	public VentaProductos getFkVenta() {
		return fkVenta;
	}

	public void setFkVenta(VentaProductos fkVenta) {
		this.fkVenta = fkVenta;
	}

	public Productos getFkProducto() {
		return fkProducto;
	}

	public void setFkProducto(Productos fkProducto) {
		this.fkProducto = fkProducto;
	}

	@Override
	public String toString() {
		return "DetalleVentaProductos [idDetalleVenta=" + idDetalleVenta + ", cantidad=" + cantidad + ", precioVenta="
				+ precioVenta + ", descuentoVenta=" + descuentoVenta + ", fkVenta=" + fkVenta + ", fkProducto="
				+ fkProducto + "]";
	}

}
