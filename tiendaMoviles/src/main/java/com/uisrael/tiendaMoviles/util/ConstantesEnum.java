package com.uisrael.tiendaMoviles.util;

public enum ConstantesEnum {
	USUARIO_EXISTENTE("El usuario ya existe en el sistema", 1),
	MENSAJE_ERROR_FALLO_OPERACION("Error al guardar la informaci�n", 2),
	MENSAJE_INFO_OPERACION_EXITOSA("Se guard� exitosamente la informaci�n", 3),
	MENSAJE_INFO_ACTUALIZACION_EXITOSA("Se actualiz� exitosamente la informaci�n", 4),
	MENSAJE_INFO_ELIMINACION_EXITOSA("Se elimin� exitosamente la informaci�n", 5);

	private String descripcion;
	private int codigo;

	private ConstantesEnum(String descripcion, int codigo) {
		this.descripcion = descripcion;
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
