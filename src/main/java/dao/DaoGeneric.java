package dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityTransaction;
import utils.JpaUtils;

public class DaoGeneric {
	
	public <E> void salvar(E entidade) {
		EntityManager entityManager = JpaUtils.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		
		entityManager.persist(entidade);
		
		entityTransaction.commit();
		entityManager.close();
	}

}
