package com.uisrael.tiendaMoviles.controlador.impl;

import com.uisrael.tiendaMoviles.controlador.ProductosControlador;
import com.uisrael.tiendaMoviles.modelo.dao.ProductosDao;
import com.uisrael.tiendaMoviles.modelo.dao.impl.ProductosDaoImpl;
import com.uisrael.tiendaMoviles.modelo.entidades.Productos;

public class ProductosControladorImpl implements ProductosControlador {

	private ProductosDao productosDao;

	public ProductosControladorImpl() {
		productosDao = new ProductosDaoImpl();
	}

	@Override
	public void insertarProducto(Productos nuevoProducto) {
		productosDao.insertarProducto(nuevoProducto);
	}

}
