package ec.com.tienda.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PropietarioEntradaDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String correo;
	private String clave;
}
