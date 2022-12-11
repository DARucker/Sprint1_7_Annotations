package n1_exercici1;

public class TrabajadorPresencial extends Trabajador {

	private static double gasolina;

	public TrabajadorPresencial(String nombre, String apellido, double precioPorHora, double gasolina) {
		super(nombre, apellido, precioPorHora);
		this.gasolina = gasolina;
	}
	
	@Override
	public double calcularSueldo(int horasTrabajadas) {
		return gasolina + horasTrabajadas * super.getPrecioPorHora();
	}

	public static double getGasolina() {
		return gasolina;
	}

	public static void setGasolina(double gasolina) {
		TrabajadorPresencial.gasolina = gasolina;
	}
	
	
	
}
