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
@Table(name = "tbl_datosTienda")
public class DatosTienda implements Serializable {

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTienda;

	private String nombreTienda;
	private int estadoTienda;
	private byte logo;

	@OneToMany(cascade = CascadeType.REFRESH, mappedBy = "fkTienda")
	private List<DatosSucursalesTienda> listaDatosSucursalesTienda = new ArrayList<DatosSucursalesTienda>();

	public int getIdTienda() {
		return idTienda;
	}

	public void setIdTienda(int idTienda) {
		this.idTienda = idTienda;
	}

	public String getNombreTienda() {
		return nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public int getEstadoTienda() {
		return estadoTienda;
	}

	public void setEstadoTienda(int estadoTienda) {
		this.estadoTienda = estadoTienda;
	}

	public byte getLogo() {
		return logo;
	}

	public void setLogo(byte logo) {
		this.logo = logo;
	}

	public List<DatosSucursalesTienda> getListaDatosSucursalesTienda() {
		return listaDatosSucursalesTienda;
	}

	public void setListaDatosSucursalesTienda(List<DatosSucursalesTienda> listaDatosSucursalesTienda) {
		this.listaDatosSucursalesTienda = listaDatosSucursalesTienda;
	}

	@Override
	public String toString() {
		return "DatosTienda [idTienda=" + idTienda + ", nombreTienda=" + nombreTienda + ", estadoTienda=" + estadoTienda
				+ ", logo=" + logo + "]";
	}

}
