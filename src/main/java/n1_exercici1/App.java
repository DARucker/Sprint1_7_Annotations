package n1_exercici1;

public class App {

	/*
	
	Crea una jerarquía de objetos con tres clases: 
	rabajador, Trabajador Online y Trabajador Presencial.
	La clase Trabajador tiene los atributos nombre, apellido, 
	precio/hora, y el método calcularSou() que recibe por 
	parámetro el número de horas trabajadas y lo multiplica 
	por el precio/hora. Las clases hijas deben sobreescribirlo, 
	empleando @Override.
	Desde el main() de la clase Principal, realiza las invocaciones
	necesarias para demostrar el funcionamiento de la anotación @Override.
	En los trabajadores presenciales, el método para calcular su sueldo, 
	recibirá por parámetro el número de horas trabajadas al mes. 
	A la hora de calcular el sueldo se multiplicará el número de horas 
	trabajadas por el precio/hora, más el valor de un atributo 
	static llamado gasolina que añadiremos en esta clase.

	En los trabajadores online, el método para calcular su sueldo
	 recibirá por parámetro el número de horas trabajadas al mes. 
	 A la hora de calcular el sueldo se multiplicará el número 
	 de horas trabajadas por el precio/hora y se le sumará el
	  precio de la tarifa plana de Internet, que será una
	   constante de la clase Trabajador Online.
	
	*/
	public static void main(String[] args) {

		App app = new App();
		app.imprimirSueldo();
	}

	public void imprimirSueldo() {
		
		Trabajador tp = new TrabajadorPresencial("Juan", "Perez" , 2.5, 50);
		Trabajador tol = new TrabajadorOnLine("Pedro", "Garcias", 2.5);
		System.out.println("El sueldo de " + tp.getNombre() + " " + tp.getApellido() + " es $" + tp.calcularSueldo(100));
		System.out.println("El sueldo de " + tol.getNombre() + " " + tol.getApellido() + " es $" + tol.calcularSueldo(100));
	}
	
}
