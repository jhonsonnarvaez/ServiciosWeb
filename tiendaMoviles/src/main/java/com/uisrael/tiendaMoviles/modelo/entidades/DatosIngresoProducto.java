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
@Table(name = "tbl_datosingreso")
public class DatosIngresoProducto implements Serializable {

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idIngreso;

	@Temporal(TemporalType.DATE)
	private Date fechaIngreso;

	private int estadoIngreso;

	@OneToMany(cascade = CascadeType.REFRESH, mappedBy = "fkIngreso")
	private List<DetalleIngresoProductos> listaDetalleIngresoProductos = new ArrayList<DetalleIngresoProductos>();

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "idProveedor")
	private InformacionProveedor fkProveedor;

	public int getIdIngreso() {
		return idIngreso;
	}

	public void setIdIngreso(int idIngreso) {
		this.idIngreso = idIngreso;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getEstadoIngreso() {
		return estadoIngreso;
	}

	public void setEstadoIngreso(int estadoIngreso) {
		this.estadoIngreso = estadoIngreso;
	}

	public List<DetalleIngresoProductos> getListaDetalleIngresoProductos() {
		return listaDetalleIngresoProductos;
	}

	public void setListaDetalleIngresoProductos(List<DetalleIngresoProductos> listaDetalleIngresoProductos) {
		this.listaDetalleIngresoProductos = listaDetalleIngresoProductos;
	}

	public InformacionProveedor getFkProveedor() {
		return fkProveedor;
	}

	public void setFkProveedor(InformacionProveedor fkProveedor) {
		this.fkProveedor = fkProveedor;
	}

	@Override
	public String toString() {
		return "DatosIngresoProducto [idIngreso=" + idIngreso + ", fechaIngreso=" + fechaIngreso + ", estadoIngreso="
				+ estadoIngreso + ", fkProveedor=" + fkProveedor + "]";
	}

}
