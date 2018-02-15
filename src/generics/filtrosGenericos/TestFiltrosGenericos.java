package generics.filtrosGenericos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import generics.classes.Carro;

public class TestFiltrosGenericos {

	public static void main(String[] args) {

		List<Carro> carros = Arrays.asList(new Carro("gol", "vermelho"), new Carro("bmw", "preto"),
				new Carro("gol", "amarelo"), new Carro("jetta", "vermelho"));

		System.out.println(filtrarObjetos(carros, carro -> carro.getNome().equals("gol")));
		System.out.println(filtrarObjetos(carros, carro -> carro.getCor().equals("vermelho")));

	}

	private static <T> List<T> filtrarObjetos(List<T> lista, Predicate<T> predicate) {
		List<T> filtrados = new ArrayList<>();
		for (T objeto: lista) {
			if (predicate.test(objeto))
				filtrados.add(objeto);
		}
		return filtrados;
	}
	
}
