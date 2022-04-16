package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Usuario;

public class Demo06 {

	
	
	
	public static void main(String[] args) {
		
	
		//LISTADO SIN PARAMETROS 
		
		
		//1 ACCEDER A FABRICA DE DATOS 
		
		EntityManagerFactory fabrica= Persistence.createEntityManagerFactory("mysql");
		
		//2 accedo a la clase del manejador de entiddaes 
		
		EntityManager em= fabrica.createEntityManager();
		
		//acciones 
		
		//con es un listado no se instacia clase ni llama trasncacciones 
		
		//listado
		
		//llamos a la clase que nos permite poder tipear un query. instanciamos con nombre consulta
		//y con em llamamos al metodo createQuery y creamos el query que nos brinda jpa, y le damos como otro 
		//paramametros la clase usuario, ya que esta al ser una entidad relacionada con la tabla es necesario usarla
		//query---> aqui en vez del nombre de la tabla, denemos colocar el nombre de la entidad 
		TypedQuery<Usuario> consulta= em.createQuery("select x from Usuario x", Usuario.class);
		
		//esta consulta devuelve una lista. asi que debemos convertirlo en lista y guardarlo en una variable tipo lista
	   List<Usuario> listaUsuarios=	consulta.getResultList();
		
	   //hacemos un ciclo for y extraemos los datos de la variabl
		for(Usuario u : listaUsuarios) {
			
			//imprimimos 
			System.out.println(u);
			
		}
		
		
		//cierro fabrica de datos
		em.close();
		
		
		
		
	}
	
	
}
