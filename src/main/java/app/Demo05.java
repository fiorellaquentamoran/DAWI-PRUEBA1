package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo05 {

	
	public static void main(String[] args) {
		
		//1acceso a fabrica
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		
		
		
		//2 aaceder a menajdaro de entidad
		
		EntityManager em= fabrica.createEntityManager();
		
		//acciones
		
		//busco
		Usuario u = em.find(Usuario.class, 55);
		
		if(u!=null) {
			em.getTransaction().begin();
			em.remove(u);
			
			//confirmo
			em.getTransaction().commit();
			System.out.println("codigo elimnado");
		}
		
		else {
			
			System.out.println("El codigo no existe");
		}
		
		em.close();
		
	}
	
	
	
}
