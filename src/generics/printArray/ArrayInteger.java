package generics.printArray;

public class ArrayInteger {
	
	public static void main(String[] args) {
		
		PrintArrayGeneric<Integer> imprimirInteiros = new PrintArrayGeneric<Integer>();
		
		Integer[] numeros = {1, 2, 3, 4, 5};
		imprimirInteiros.imprimirArray(numeros);
		
	}
}
