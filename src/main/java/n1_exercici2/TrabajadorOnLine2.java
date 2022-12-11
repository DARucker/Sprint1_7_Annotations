package n1_exercici2;

public class TrabajadorOnLine2 extends Trabajador2 {

	private final double TARIFAINTERNET = 128;
	
	public TrabajadorOnLine2(String nombre, String apellido, double precioPorHora) {
		super(nombre, apellido, precioPorHora);
	}

	@Override
	public double calcularSueldo(int horasTrabajadas) {
		
		return TARIFAINTERNET + horasTrabajadas * super.getPrecioPorHora();
	}
	
}
