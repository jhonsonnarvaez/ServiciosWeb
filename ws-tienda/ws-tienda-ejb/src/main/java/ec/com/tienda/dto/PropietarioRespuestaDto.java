package ec.com.tienda.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class PropietarioRespuestaDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PropietarioSalidaDto propietario;
	private List<PropietarioSalidaDto> cuerpoLista;
	private String respuesta;
	private String mensaje;

}
