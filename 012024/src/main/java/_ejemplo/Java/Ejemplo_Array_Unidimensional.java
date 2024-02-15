package _ejemplo.Java;

public class Ejemplo_Array_Unidimensional {

	public static void main(String[] args) {
		
		/*ejemplos de declaracion de arreglos
		int intArray[];
		int [] intarray2;
		double doublearray[];*/
		
		//Declarar un arreglo de strings
		String [] arr;
		
		//Asignar memoria para 5 Strings
		arr = new String[5];
		
		//inicializar el primer elemento del arreglo
		arr[0] = "cero";
		//inicializar el segundo elemento del arreglo
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		System.out.println("La posicion del arreglo es: " + arr[3]);
		System.out.println();
		
		for(int i = 0; i <arr.length; i++) { //arr.lenght calcula la longuitud del arreglo en un tipo de dato int
			System.out.println("Elemento en el indice " + i + ": " + arr[i]);
		}
		
		/*ejemplo de arreglos con enteros
		int [] intArr = new int[] {1,2,3,4,5,6,7,8};*/
}
	
}