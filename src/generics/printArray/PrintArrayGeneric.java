package generics.printArray;

public class PrintArrayGeneric<T> {
	
	public static void main(String[] args) {
		
//		
//		System.out.println("---------------------------------------------");
//		
//		String[] numerosString = {"1", "2", "3", "4", "5"};
//		imprimirArray(numerosString);
	}
	
	public void imprimirArray(T[] array) {
		for (T t : array) {
			System.out.print(t.toString() +", ");
		}
		System.out.println();
	}
}
