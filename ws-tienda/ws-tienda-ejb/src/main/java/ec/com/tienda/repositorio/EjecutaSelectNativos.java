package ec.com.tienda.repositorio;

import java.util.List;

import javax.persistence.Query;

import ec.com.tienda.repositorio.exception.DAOException;

public class EjecutaSelectNativos {
	public static <T> List<T> listarPorSentenciaSql(Query query, Class claseRetorno) throws DAOException {
		try {
			return RetornoListaSql.retornar(query.getResultList(), claseRetorno);
		} catch (RuntimeException e) {
			throw new DAOException(e);
		}
	}
}
