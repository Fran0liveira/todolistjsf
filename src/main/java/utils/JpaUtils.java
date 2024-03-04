package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
	
	private static EntityManagerFactory factory; 
	
	static {
		if(factory == null) {
			factory = Persistence.createEntityManagerFactory("todolistjsf");
		}
		
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

}
