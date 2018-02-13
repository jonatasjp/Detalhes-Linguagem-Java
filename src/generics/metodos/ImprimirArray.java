package generics.metodos;

import java.util.Arrays;
import java.util.List;

public class ImprimirArray {
	
	public static void main(String[] args) {
		
		String[] strings = {"jonatas", "andré"};
		Integer[] ints = {1, 2, 3, 4};
		
		imprimirArray(strings);
		System.out.println("-----------------");
		imprimirArray(ints);
		System.out.println("-----------------");
		imprimirLista(Arrays.asList(strings));
		System.out.println("-----------------");
		imprimirLista(Arrays.asList(ints));
	}

	private static <T> void imprimirArray(T[] array) {
		for (T t : array) {
			System.out.println(t);
		}
	}

	private static <T> void imprimirLista(List<T> list) {
		for (T t : list) {
			System.out.println(t);
		}
	}
}
