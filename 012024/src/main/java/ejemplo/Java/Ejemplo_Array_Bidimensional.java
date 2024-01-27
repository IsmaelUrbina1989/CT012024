package ejemplo.Java;

public class Ejemplo_Array_Bidimensional {

	public static void main(String[] args) {
		
		//Declarar e inicializar a un arreglo en 2dimensiones
		int arr[][] = {{2, 7, 9},{3, 6, 1},{5, 8, 4}};
		
		System.out.println(arr[0][0]);
		System.out.println();
		
		//imprimir array 2dimensiones
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " "); //	print para inmprimir en la misma linea
			}
			System.out.println();
		}
	}
}