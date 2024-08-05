package beans;

public class Item {

	//Atributos
	private String item;
	private int    unidades;
	private double valor;
	
	//Constructores	
	//Es necesario un constructor sin parámetros 
	//para poder hacer uso del useBean desde la .jsp
	public Item() {
		
	}
	
	public Item(String item, int unidades, double valor) {
		super();
		this.item = item;
		this.unidades = unidades;
		this.valor = valor;
	}

	//Getters & Setters
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
