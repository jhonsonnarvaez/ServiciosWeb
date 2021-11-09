package ec.com.tienda.repositorio.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenericaDaoImpl<T> {

	private Class<T> entityClass;

	protected static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU_controlTiendaDS");
	protected EntityManager entityManager;

	// constructores
	public GenericaDaoImpl() {
		entityManager = emf.createEntityManager();// crear conexion
	}

	public GenericaDaoImpl(Class<T> entityClass) {
		this.entityClass = entityClass;
		entityManager = emf.createEntityManager();
	}

	// Definimos el CRUD
	public T create(T t) {
		this.entityManager.persist(t);
		return t;
	}

	public T read(Object id) {
		return this.entityManager.find(entityClass, id);
	}

	public T update(T t) {
		return this.entityManager.merge(t);
	}

	public void delete(T t) { // borrado físico
		t = this.entityManager.merge(t);
		this.entityManager.remove(t);
	}

	// Definir las transacciones
	public void beginTransaction() {
		if (!entityManager.getTransaction().isActive()) // existe conexion activa
			entityManager = emf.createEntityManager(); // crear conexion

		entityManager.getTransaction().begin(); // inicializar transacción
	}

	public void commit() {
		if (entityManager.getTransaction().isActive())
			entityManager.getTransaction().commit();
	}

	public void rollback() {
		if (entityManager.getTransaction().isActive())
			entityManager.getTransaction().rollback();
	}

	public void closeTransaction() {
		entityManager.close();
	}

	public void commitAndCloseTransaction() {
		commit();
		closeTransaction();
	}

	public void flush() {
		entityManager.flush();
	}
}
