package pack_saluto;

public class Saluto {
	
	public int id;
	public String contenuto;
	
	public Saluto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Saluto(int id, String contenuto) {
		super();
		this.id = id;
		this.contenuto = contenuto;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getContenuto() {
		return contenuto;
	}
	
	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}
	
	
	
}
