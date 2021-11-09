package ec.com.tienda.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PropietarioSalidaDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String idPropietario;
	private String nombrePropietario;
	private String apellidoPropietario;
	private String identificacionPropietario;
	private String telefonoPropietario;
	private String celularPropietario;
	private String contrasenaPropietario;
	private String correoPropietario;
	private String estadoPropietario;
	private String ididentificacionpersona;
	public PropietarioSalidaDto(String idPropietario, String nombrePropietario, String apellidoPropietario,
			String identificacionPropietario, String telefonoPropietario, String celularPropietario,
			String contrasenaPropietario, String correoPropietario, String estadoPropietario,
			String ididentificacionpersona) {
		super();
		this.idPropietario = idPropietario;
		this.nombrePropietario = nombrePropietario;
		this.apellidoPropietario = apellidoPropietario;
		this.identificacionPropietario = identificacionPropietario;
		this.telefonoPropietario = telefonoPropietario;
		this.celularPropietario = celularPropietario;
		this.contrasenaPropietario = contrasenaPropietario;
		this.correoPropietario = correoPropietario;
		this.estadoPropietario = estadoPropietario;
		this.ididentificacionpersona = ididentificacionpersona;
	}
	
	
}
