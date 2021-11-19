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
@Table(name = "tbl_cuentas")
public class CuentasVenta implements Serializable {

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCuenta;

	private int estadoCuenta;
	private int cuentaCancelada;

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "idCuentaPorCobrar")
	private CuentaPorCobrar fkCuentaPorCobrar;

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "idVenta")
	private VentaProductos fkVenta;

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	public int getEstadoCuenta() {
		return estadoCuenta;
	}

	public void setEstadoCuenta(int estadoCuenta) {
		this.estadoCuenta = estadoCuenta;
	}

	public int getCuentaCancelada() {
		return cuentaCancelada;
	}

	public void setCuentaCancelada(int cuentaCancelada) {
		this.cuentaCancelada = cuentaCancelada;
	}

	public CuentaPorCobrar getFkCuentaPorCobrar() {
		return fkCuentaPorCobrar;
	}

	public void setFkCuentaPorCobrar(CuentaPorCobrar fkCuentaPorCobrar) {
		this.fkCuentaPorCobrar = fkCuentaPorCobrar;
	}

	public VentaProductos getFkVenta() {
		return fkVenta;
	}

	public void setFkVenta(VentaProductos fkVenta) {
		this.fkVenta = fkVenta;
	}

	@Override
	public String toString() {
		return "CuentasVenta [idCuenta=" + idCuenta + ", estadoCuenta=" + estadoCuenta + ", cuentaCancelada="
				+ cuentaCancelada + ", fkCuentaPorCobrar=" + fkCuentaPorCobrar + ", fkVenta=" + fkVenta + "]";
	}

}
