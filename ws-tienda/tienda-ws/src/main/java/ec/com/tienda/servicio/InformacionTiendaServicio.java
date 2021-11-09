package ec.com.tienda.servicio;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ec.com.tienda.dao.PropietarioDao;
import ec.com.tienda.dto.PropietarioEntradaDto;
import ec.com.tienda.dto.PropietarioRespuestaDto;
import ec.com.tienda.dto.PropietarioSalidaDto;
import lombok.Getter;

@Singleton
@Consumes(MediaType.APPLICATION_JSON)
@Path("tienda")
public class InformacionTiendaServicio {
	@EJB
	@Getter
	private PropietarioDao propietarioDao;

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("obtenerUsuario")
	public PropietarioRespuestaDto obtenerUsuario(final PropietarioEntradaDto propietarioDto) {
		PropietarioRespuestaDto respuesta = new PropietarioRespuestaDto();
		try {
			PropietarioSalidaDto propietario = getPropietarioDao().validarUsuario(propietarioDto.getCorreo(),
					propietarioDto.getClave());
			respuesta.setPropietario(propietario);
			respuesta.setMensaje("Exito");
			respuesta.setRespuesta("0");
		} catch (Exception e) {
			respuesta.setMensaje("Error");
			respuesta.setRespuesta(e.getMessage());
		}
		return respuesta;
	}
}