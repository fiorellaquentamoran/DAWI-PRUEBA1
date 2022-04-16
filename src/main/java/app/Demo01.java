package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo01 {

	
	//metodo que no devukeve nada y ejecuta el cod al ejecutar la app
	public static void main(String[] args) {
		//registrar nuevo usuario
		
		
		//1----INSTACIO CLASE PARA ACEESO A DATOS
		//fabrica de acceso a datos ---DAO
		//es como el patron DAO---
		//ESTO NOS PERMITE PODER ACCEDER A LOS METODOS QUE CONTIENE ORM
		//instancio a la clase y lo guardo en fabrica. con el metodo persistente
		//lamos al metodo createentitiymanager y le doy el nombre de la unidad de persistencia 
		//que usaremos
		
		EntityManagerFactory fabrica= Persistence.createEntityManagerFactory("mysql");
		
		
		//2
		//manejador de entidad 
		//con esta clase se crea las entitades que se necesitan en la base de datos
		EntityManager em= fabrica.createEntityManager();
		
		
		//3
		//empezar procesos----> registro,actualizar,eliminar
		 
		//incio una transaccion para que se pueda detener la operacion en caso salga mal
		em.getTransaction().begin();
		
		
		//4
		//acciones 
		//llamo a mi clase y le seteo los datos por medio del
		//constructor y los guardo en una variable
		Usuario u = new Usuario(45,"Fiora","Quenta","Fe@gmail.com","1234","1999/10/10",1,1);
		
		
		//por medio del metodo persist le envio la variable que guarda
		 // los datos del usuario 
		em.persist(u);
		
		
		
		
		
		//confirmo la trasnaccion
		em.getTransaction().commit();
		
		//cierro la conexion 
		em.close();
		
		
		
		
	}
	
	
	
	
	
	
}
