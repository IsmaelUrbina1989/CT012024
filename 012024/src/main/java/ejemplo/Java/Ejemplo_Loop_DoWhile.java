package ejemplo.Java;

public class Ejemplo_Loop_DoWhile {

	public static void main(String[] args) {
		
       int b = 10;
		
		do { 
			//este codigo dentro del Do se imprime si la condicion del while es falsa
			System.out.println("el valor de B es: " + b);
			b++; //incrementa el valor de la variable para la siguiente iteracion			
		}while (b <= 15);

	}

}
