package generics.printArray;

public class PrintArrayGeneric<T> {
	
	public void imprimirArray(T[] array) {
		for (T t : array) {
			System.out.print(t.toString() +", ");
		}
		System.out.println();
	}
}
