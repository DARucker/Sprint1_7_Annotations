package n1_exercici2;

public class App2 {

	/*
	
Añade a las clases hijas algunos métodos obsoletos (deprecated), y 
utiliza la anotación correspondiente. 
Invoca desde una clase externa los métodos obsoletos, suprimiendo 
mediante la correspondiente anotación los “warnings” para ser obsoletos.

	*/
	
	Trabajador2 tp2;
	Trabajador2 tol2;
	private String nombre; // el warning vinculado al no uso de este campo no se suprime
	
	public static void main(String[] args) {

		App2 app2 = new App2();
		app2.imprimirSueldo();
		app2.utilizarMetodosDepretated();
	}

	public void imprimirSueldo() {
		
		tp2 = new TrabajadorPresencial2("Juan", "Perez" , 2.5);
		tol2 = new TrabajadorOnLine2("Pedro", "Garcias", 2.5);
		System.out.println("El sueldo de " + tp2.getNombre() + " " + tp2.getApellido() + " es $" + tp2.calcularSueldo(100));
		System.out.println("El sueldo de " + tol2.getNombre() + " " + tol2.getApellido() + " es $" + tol2.calcularSueldo(100));
	}
	
	@SuppressWarnings("deprecation")
	public void utilizarMetodosDepretated() {
		Trabajador2 tp1 = new TrabajadorPresencial2();
		Trabajador2 t2 = new Trabajador2();
		TrabajadorPresencial2 tp3 = new TrabajadorPresencial2();
		tp1.calcularDescuentoGasolina();
		t2.calcularDescuentoGasolina();
		tp3.antiguedad();
		tp3.calcularDescuentoGasolina();
		
		
		
		
	}
	
}
