package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//con esto se convierte en una entiedad a esta clase 
//asi que es necesario colocar y definir sus llaves primarias foraneas
@Entity
@Table(name = "tb_usuarios")
public class Usuario {

	//atributos 
	//es necesario colocar cada atributo en una linea diferente ya que son independientes
	//para poder realizar su configracuon y establecer valores.
	
	//con esto definimos la llave primaria (siemre debe ser de javax.persistence)
	@Id
	
	//con esto mapeamos y relacioamos este atributo con la columna respectiva de la bd
	@Column(name="cod_usua")
	//para autogenerar el valor de la llave primaria, en caso no se tenga el valor de autonicremt en la tabla
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo ;
	
	@Column(name="nom_usua")
	private String nombre;
	
	@Column(name="ape_usua")
	private String apellido;
	
	@Column(name="usr_usua")
	private String usuario;
	
	@Column(name="cla_usua")
	private String clave;
	
	@Column(name="fna_usua")
	private String fchnacim;
	
	@Column(name="idtipo")
	private int tipo;
	
	@Column(name="est_usua")
	private int estado;
	
	
	
	
	

	//CONSTRUCTORES 
	
	
	
	//DEVUELVE LOS DATOS DE LA ENTIDAD USUARIO 
@Override
	public String toString() {
	
		return "Usuario [codigo=" + codigo + ", "
				+ "nombre=" + nombre + ", "
				+ "apellido="+ apellido + ", "
						+ "usuario=" + usuario
				+ ", clave=" + clave + ","
						+ " fchnacim="+ fchnacim + ", tipo=" + tipo + ", estado=" 
				+ estado + "]";
	}

	//VACIO 
	public Usuario() {
		
		super();
	}
	
	//CON CAMPOS
	
	public Usuario(int codigo, String nombre, String apellido, String usuario, String clave, String fchnacim, int tipo,
			int estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.clave = clave;
		this.fchnacim = fchnacim;
		this.tipo = tipo;
		this.estado = estado;
	}

	//METODOS DE ACCESO
	

	public int getCodigo() {
		return codigo;
	}

	

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getFchnacim() {
		return fchnacim;
	}

	public void setFchnacim(String fchnacim) {
		this.fchnacim = fchnacim;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
	
	
	
	
}










/*
//con esto se convierte en una entiedad a esta clase 
//asi que es necesario colocar y definir sus llaves primarias foraneas
@Entity
@Table(name = "tb_usuarios")
public class Usuario {

	//atributos 
	//es necesario colocar cada atributo en una linea diferente ya que son independientes
	//para poder realizar su configracuon y establecer valores.
	
	//con esto definimos la llave primaria (siemre debe ser de javax.persistence)
	@Id
	
	//con esto mapeamos y relacioamos este atributo con la columna respectiva de la bd
	@Column(name="cod_usua")
	//para autogenerar el valor de la llave primaria, en caso no se tenga el valor de autonicremt en la tabla
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo ;
	
	@Column(name="nom_usua")
	private String nombre;
	
	@Column(name="ape_usua")
	private String apellido;
	
	@Column(name="usr_usua")
	private String usuario;
	
	@Column(name="cla_usua")
	private String clave;
	
	@Column(name="fna_usua")
	private String fchnacim;
	
	@Column(name="idtipo_usua")
	private int tipo;
	
	@Column(name="est_usua")
	private int estado;
	
	
	
	
	

	//CONSTRUCTORES 
	
	
	
	//DEVUELVE LOS DATOS DE LA ENTIDAD USUARIO 
@Override
	public String toString() {
	
		return "Usuario [codigo=" + codigo + ", "
				+ "nombre=" + nombre + ", "
				+ "apellido="+ apellido + ", "
						+ "usuario=" + usuario
				+ ", clave=" + clave + ","
						+ " fchnacim="+ fchnacim + ", tipo=" + tipo + ", estado=" 
				+ estado + "]";
	}

	//VACIO 
	public Usuario() {
		
		super();
	}
	
	//CON CAMPOS
	
	public Usuario(int codigo, String nombre, String apellido, String usuario, String clave, String fchnacim, int tipo,
			int estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.clave = clave;
		this.fchnacim = fchnacim;
		this.tipo = tipo;
		this.estado = estado;
	}

	//METODOS DE ACCESO
	

	public int getCodigo() {
		return codigo;
	}

	

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getFchnacim() {
		return fchnacim;
	}

	public void setFchnacim(String fchnacim) {
		this.fchnacim = fchnacim;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
	
	
	
	*/
//}
