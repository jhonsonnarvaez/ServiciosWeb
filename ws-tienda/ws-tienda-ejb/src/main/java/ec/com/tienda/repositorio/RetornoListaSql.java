package ec.com.tienda.repositorio;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import ec.com.tienda.repositorio.exception.DAOException;

public class RetornoListaSql {
	public static <T> List<T> retornar(List<Object[]> listaSql, Class clase) throws DAOException {
		List listaRetorno = new ArrayList();
		for (Object[] o : listaSql) {
			listaRetorno.add(retornarInstancia(o, clase));
		}
		return listaRetorno;
	}

	private static Object retornarInstancia(Object[] o, Class clase) throws DAOException {
		try {
			Object[] oAux = new Object[o.length];
			Class[] clases = new Class[o.length];
			for (int i = 0; i < o.length; ++i) {
				clases[i] = String.class;
				String elemento = "";
				if (o[i] != null) {
					elemento = String.valueOf(o[i]);
				}
				oAux[i] = String.valueOf(elemento.trim());
			}
			Constructor c = clase.getConstructor(clases);
			return c.newInstance(oAux);
		} catch (InstantiationException | NoSuchMethodException | SecurityException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			throw new DAOException(e);
		}
	}
}
