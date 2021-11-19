package com.uisrael.tiendaMoviles.util;

public enum ConstantesEnum {
	USUARIO_EXISTENTE("El usuario ya existe en el sistema", 1),
	MENSAJE_ERROR_FALLO_OPERACION("Error al guardar la información", 2),
	MENSAJE_INFO_OPERACION_EXITOSA("Se guardó exitosamente la información", 3),
	MENSAJE_INFO_ACTUALIZACION_EXITOSA("Se actualizó exitosamente la información", 4),
	MENSAJE_INFO_ELIMINACION_EXITOSA("Se eliminó exitosamente la información", 5);

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
