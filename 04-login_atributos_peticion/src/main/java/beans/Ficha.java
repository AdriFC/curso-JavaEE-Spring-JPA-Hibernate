package beans;

public class Ficha {
	
	//Atributos
	private String usuario;
	private int    edad;
	private String email;
	
	//Constructor
	public Ficha(String usuario, int edad, String email) {
		super();
		this.usuario = usuario;
		this.edad = edad;
		this.email = email;
	}

	//getters & setters
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
