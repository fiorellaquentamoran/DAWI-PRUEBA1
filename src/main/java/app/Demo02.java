package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo02 {

	public static void main(String[] args) {
		
	//actualizar nuevo usuario
		
		
		//1 acceder a la fabrica de datos
		//fabrica de acceso a datos ---DAO
		
		//instacnaimos la clase
		EntityManagerFactory fabrica= Persistence.createEntityManagerFactory("mysql");
		
		
		//manejador de entidad 
		//accedemos al entity manajger para poder accder a los metodos lpa
		EntityManager em= fabrica.createEntityManager();
		
		
		//2--->empezar procesos----> registro,actualizar,eliminar
		 
		//doy inicio a mi transaccion
		em.getTransaction().begin();
		
		
		//acciones 
		//update into
		//guardo datos en la clase instanciada por medio del constructor(no se usa metodo set ya que
		//el metodo del consutructor lo enviar
		Usuario u = new Usuario
	    (55,"Fiorella","Quenta","FTomlinson@gmail.com","1234","1999/10/10",1,1);
		
		
		
		//comando para actualizar la informacion
		em.merge(u); 
		//busca si el codigo existe, si si exsite lo actualiza,
		//sino lo crea o sea inserta el codigo
		//METODO ME DEVUELVE LA INFORMACION DEL USUARIO
		
		
		
		
		
		
		//confirmacion mi transaccion
		em.getTransaction().commit();
		
		//cerrar conexion 
		em.close();
		
		
		
	}
	
	
}
