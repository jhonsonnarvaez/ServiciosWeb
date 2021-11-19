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
@Table(name = "tbl_cuentaporcobrar")
public class CuentaPorCobrar implements Serializable {

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCuentaPorCobrar;

	private double subtotalCobrar;
	private double totalCobrar;
	private double abonoCobrar;
	private double saldoCobrar;

	@OneToMany(cascade = CascadeType.REFRESH, mappedBy = "fkCuentaPorCobrar")
	private List<CuentasVenta> listaCuentasVenta = new ArrayList<CuentasVenta>();

	public int getIdCuentaPorCobrar() {
		return idCuentaPorCobrar;
	}

	public void setIdCuentaPorCobrar(int idCuentaPorCobrar) {
		this.idCuentaPorCobrar = idCuentaPorCobrar;
	}

	public double getSubtotalCobrar() {
		return subtotalCobrar;
	}

	public void setSubtotalCobrar(double subtotalCobrar) {
		this.subtotalCobrar = subtotalCobrar;
	}

	public double getTotalCobrar() {
		return totalCobrar;
	}

	public void setTotalCobrar(double totalCobrar) {
		this.totalCobrar = totalCobrar;
	}

	public double getAbonoCobrar() {
		return abonoCobrar;
	}

	public void setAbonoCobrar(double abonoCobrar) {
		this.abonoCobrar = abonoCobrar;
	}

	public double getSaldoCobrar() {
		return saldoCobrar;
	}

	public void setSaldoCobrar(double saldoCobrar) {
		this.saldoCobrar = saldoCobrar;
	}

	public List<CuentasVenta> getListaCuentasVenta() {
		return listaCuentasVenta;
	}

	public void setListaCuentasVenta(List<CuentasVenta> listaCuentasVenta) {
		this.listaCuentasVenta = listaCuentasVenta;
	}

	@Override
	public String toString() {
		return "CuentaPorCobrar [idCuentaPorCobrar=" + idCuentaPorCobrar + ", subtotalCobrar=" + subtotalCobrar
				+ ", totalCobrar=" + totalCobrar + ", abonoCobrar=" + abonoCobrar + ", saldoCobrar=" + saldoCobrar
				+ "]";
	}

}
