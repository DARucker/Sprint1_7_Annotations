package n1_exercici2;

import java.util.Date;

public class TrabajadorPresencial2 extends Trabajador2 {

	private static double gasolina = 50;

	public TrabajadorPresencial2(String nombre, String apellido, double precioPorHora) {
		super(nombre, apellido, precioPorHora);
	}
		
	public TrabajadorPresencial2() {}
	
	@Override
	public double calcularSueldo(int horasTrabajadas) {
		return gasolina + horasTrabajadas * super.getPrecioPorHora();
	}
	


	public static double getGasolina() {
		return gasolina;
	}

	public static void setGasolina(double gasolina) {
		TrabajadorPresencial2.gasolina = gasolina;
	}
	
	// Utilizo un metodo deprecated
	public void antiguedad() {
		Date date = new Date();
		System.out.println("el metodo getDate() esta Deprecated. El valor arrojado por el metodo es " + date.getDate());
	}
	
	// Declaro un metodo como @Deprecated
	@Deprecated
	public void calcularDescuentoGasolina() {
		
		System.out.println("El metodo TrabajadorPresencial2.CalcularDesucntoGasolina() esta Deprecated");
	}
	
}
