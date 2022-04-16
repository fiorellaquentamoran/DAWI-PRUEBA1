package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Usuario;

public class Semana07 {

	//METODO PARA LISTADO CON PARAMETROS 
	public static void main(String[] args) {
		
		//1 fabrica de acceso a dtos 
		EntityManagerFactory fabrica= Persistence.createEntityManagerFactory("mysql");
		
		//2 manejador de entidades
		EntityManager em= fabrica.createEntityManager();
		
		//acciones 
		
		//consulta
		TypedQuery<Usuario> consultaP= em.createQuery("select u from Usuario u where u.tipo= :xtipo", Usuario.class);
		
		//envio parametros
		consultaP.setParameter("xtipo",1);
		
		
		//traigo la data para mostrar 
		
		List<Usuario> listado= consultaP.getResultList();
		
		//hago recorrido para extraer los datos 
		
		for(Usuario usuario: listado) {
			
			//imprimo
			
			System.out.println(usuario);
			
		}
		
		
		
		
		//cierro fabrica 
		em.close();
		
		
		
	}
	
	
}
