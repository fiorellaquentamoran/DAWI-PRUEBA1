package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo03 {

	public static void main(String[] args) {
		
		//eliminar usuario 
		
	 
		
		
		
		//fabrica de acceso a datos ---DAO
		
		EntityManagerFactory fabrica= Persistence.createEntityManagerFactory("mysql");
		
		
		//manejador de entidad 
		EntityManager em= fabrica.createEntityManager();
		
		
		//empezar procesos----> registro,actualizar,eliminar
		 
		em.getTransaction().begin();
		
		
		//acciones 
		//delete ---------where......
		
		//instancio clase 
		Usuario u = new Usuario();
		//y le guardo el codigo que deseo buscar para eliminar
		u.setCodigo(45);
	
		
		//la variable u guarda este numero y se envia
		//al metodo remove en donde busca el cod y lo elimina
		//comando para eliminar la informacion
	
		//!para poder eliminar se debe buscar un codigo 
		
		em.remove(u); 
		//
	 	
		
		
		//confirmacion
		em.getTransaction().commit();
		
		//cerrar conexion 
		em.close();
		
		
		//!ojo!
		//sale error cuando le mandamos solo un codigo por medio del set
		//ya que al ser un ojbeto requiere que se le envie todos los datos
		
		
	}
	
	
	
	
}
