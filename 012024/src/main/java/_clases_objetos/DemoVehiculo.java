package _clases_objetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		
		Vehiculo minivan = new Vehiculo();
		
		int rango;
		
		//Asignar los valorees a los campos de minivan
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.khm = 20;
		
		//Calcular el rango asuminedo un tanque lleno
		rango = minivan.capacidad * minivan.khm;
		
		System.out.println();
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango + " kilometros");
		System.out.println();
		
		Vehiculo carro = new Vehiculo();
		carro.pasajeros = 4;
		System.out.println("Numero de pasajeros en carro es: " + carro.pasajeros);

	}

}
