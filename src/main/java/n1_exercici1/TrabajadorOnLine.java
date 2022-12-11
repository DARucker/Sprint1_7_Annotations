package n1_exercici1;

public class TrabajadorOnLine extends Trabajador {

	private final double TARIFAINTERNET = 128;
	
	public TrabajadorOnLine(String nombre, String apellido, double precioPorHora) {
		super(nombre, apellido, precioPorHora);
	}

	@Override
	public double calcularSueldo(int horasTrabajadas) {
		return TARIFAINTERNET + horasTrabajadas * super.getPrecioPorHora();
	}
	
}
