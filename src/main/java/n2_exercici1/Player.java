package n2_exercici1;

import practicas.SerializeJson;

@SerializeJson (path = "src\\main\\java\\players.json")
public class Player {

	private String Nombre;
	private String Apellido;
	
	public Player() {}

	public Player(String nombre, String apellido) {
		super();
		Nombre = nombre;
		Apellido = apellido;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	
	
}
