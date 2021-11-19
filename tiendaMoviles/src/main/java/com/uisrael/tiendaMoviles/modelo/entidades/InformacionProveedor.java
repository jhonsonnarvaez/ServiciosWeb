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
@Table(name = "tbl_datosproveedor")
public class InformacionProveedor implements Serializable {

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProveedor;

	private String codigoProveedor;
	private String nombreProveedor;
	private String direccionProveedor;
	private int estadoProveedor;

	@OneToMany(cascade = CascadeType.REFRESH, mappedBy = "fkProveedor")
	private List<DatosIngresoProducto> listaDatosIngresoProducto = new ArrayList<DatosIngresoProducto>();

	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getCodigoProveedor() {
		return codigoProveedor;
	}

	public void setCodigoProveedor(String codigoProveedor) {
		this.codigoProveedor = codigoProveedor;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getDireccionProveedor() {
		return direccionProveedor;
	}

	public void setDireccionProveedor(String direccionProveedor) {
		this.direccionProveedor = direccionProveedor;
	}

	public int getEstadoProveedor() {
		return estadoProveedor;
	}

	public void setEstadoProveedor(int estadoProveedor) {
		this.estadoProveedor = estadoProveedor;
	}

	public List<DatosIngresoProducto> getListaDatosIngresoProducto() {
		return listaDatosIngresoProducto;
	}

	public void setListaDatosIngresoProducto(List<DatosIngresoProducto> listaDatosIngresoProducto) {
		this.listaDatosIngresoProducto = listaDatosIngresoProducto;
	}

	@Override
	public String toString() {
		return "InformacionProveedor [idProveedor=" + idProveedor + ", codigoProveedor=" + codigoProveedor
				+ ", nombreProveedor=" + nombreProveedor + ", direccionProveedor=" + direccionProveedor
				+ ", estadoProveedor=" + estadoProveedor + "]";
	};

}
