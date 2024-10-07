package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cursos")
public class Curso {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int    idCurso;
	private String denominacion;
	private int    duracion;
	private double precio;
	
	//Constructores
	public Curso(int idCurso, String denominacion, int duracion, double precio) {
		super();
		this.idCurso      = idCurso;
		this.denominacion = denominacion;
		this.duracion     = duracion;
		this.precio       = precio;
	}
	public Curso() {
		super();
	}
	
	//Setters & Getters
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public String getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
