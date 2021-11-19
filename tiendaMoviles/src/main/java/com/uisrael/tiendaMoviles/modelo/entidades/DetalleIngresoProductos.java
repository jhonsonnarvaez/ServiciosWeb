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
@Table(name = "tbl_detalleproductos")
public class DetalleIngresoProductos implements Serializable {

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetalleIngreso;

	private int cantidadProducto;
	private double precioCompra;
	private double precioVenta;

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "idProducto")
	private Productos fkProducto;

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "idIngreso")
	private DatosIngresoProducto fkIngreso;

	public int getIdDetalleIngreso() {
		return idDetalleIngreso;
	}

	public void setIdDetalleIngreso(int idDetalleIngreso) {
		this.idDetalleIngreso = idDetalleIngreso;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public Productos getFkProducto() {
		return fkProducto;
	}

	public void setFkProducto(Productos fkProducto) {
		this.fkProducto = fkProducto;
	}

	public DatosIngresoProducto getFkIngreso() {
		return fkIngreso;
	}

	public void setFkIngreso(DatosIngresoProducto fkIngreso) {
		this.fkIngreso = fkIngreso;
	}

	@Override
	public String toString() {
		return "DetalleIngresoProductos [idDetalleIngreso=" + idDetalleIngreso + ", cantidadProducto="
				+ cantidadProducto + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", fkProducto="
				+ fkProducto + ", fkIngreso=" + fkIngreso + "]";
	}

}
