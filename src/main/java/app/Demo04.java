package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo04 {

	
	public static void main(String[] args) {
		
		//1 acceder a fabrica de datos 
		
		EntityManagerFactory fabrica= Persistence.createEntityManagerFactory("mysql");
		
		//2 accder a manejador de entidad 
		EntityManager em= fabrica.createEntityManager();
		
		//3 acciones a realizar
	
		
		//!!-si no le pongo .class, me sale error, ya que este 
		//metodo pide una clase, pero la clase usuario es una entidad 
		//por lo que se dbe convertir en clase con el .class
		
		
		
		Usuario u= em.find(Usuario.class, 45);		
	     
		//si el id existe devuelve los datos del objweto
		//si no existe entonces devuleve valor null
		
		
		//si el usuario devuleto por metod int noe sta vacioa
		if(u !=null)
			//lo imprimismo
			System.out.println(u);
		
		else
			
			//sino entonces imprimimos un mensaje
			System.out.println("el codigo no existe");
		
		
		
		
	}
	
}
