package n1_exercici2;

public class Trabajador2 {
	private String nombre;
	private String apellido;
	private double precioPorHora;
	
	public Trabajador2(String nombre, String apellido, double precioPorHora) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.precioPorHora = precioPorHora;
	}

	public Trabajador2() {}
	
	public double calcularSueldo(int horasTrabajadas) {
		return horasTrabajadas * precioPorHora;
	}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public String getApellido() {return apellido;}
	public void setApellido(String apellido) {this.apellido = apellido;}
	public double getPrecioPorHora() {return precioPorHora;}
	public void setPrecioPorHora(double precioPorHora) {this.precioPorHora = precioPorHora;	}

	@Deprecated
	public void calcularDescuentoGasolina() {
		System.out.println("El metodo Trabajador2.calcularDescuentoGasolina() esta Deprecated.");
	}
}
