package ec.com.tienda.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import ec.com.tienda.dto.PropietarioSalidaDto;
import ec.com.tienda.repositorio.EjecutaSelectNativos;
import ec.com.tienda.repositorio.dao.impl.GenericaDaoImpl;
import ec.com.tienda.repositorio.exception.DAOException;
import ec.com.tienda.sql.Sql;

@Stateless
public class PropietarioDao extends GenericaDaoImpl<Object> {

	public PropietarioSalidaDto validarUsuario(String correo, String contrasena) throws DAOException {
		Query query = entityManager.createNativeQuery(Sql.SQL_OBTENER_USUARIO);
		query.setParameter(1, correo);
		query.setParameter(2, contrasena);
		List<PropietarioSalidaDto> respuesta = EjecutaSelectNativos.listarPorSentenciaSql(query,
				PropietarioSalidaDto.class);
		return respuesta.get(0);
	}
}
