package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_producto")
public class Producto {

	@Id
	@Column(name="id_prod")
	private String codigo;
	
	@Column(name="des_prod")
	private String nombre;
	
	@Column(name="stk_prod")
	private int stock;
	
	@Column(name="pre_prod")
	private double precio;
	
	@Column(name="idcategoria")
	private int categoria;
	

	
	
	
	
	
	
	
	
	//constructor
	
	public Producto() {
		
		super();
	}
	
	
		//metodo de acceso get y set 
		
		

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}









}
