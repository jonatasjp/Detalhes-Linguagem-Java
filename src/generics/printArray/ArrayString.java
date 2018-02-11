package generics.printArray;

public class ArrayString {

	public static void main(String[] args) {

		PrintArrayGeneric<String> imprimirInteiros = new PrintArrayGeneric<>();

		String[] numerosString = {"1", "2", "3", "4", "5"};
		imprimirInteiros.imprimirArray(numerosString);

	}
}
