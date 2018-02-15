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

		System.out.println(filtrarCarros(carros, carro -> carro.getNome().equals("gol")));
		System.out.println(filtrarCarros(carros, carro -> carro.getCor().equals("vermelho")));

	}

	private static List<Carro> filtrarCarros(List<Carro> carros, Predicate<Carro> predicate) {
		List<Carro> carrosFiltrados = new ArrayList<>();
		for (Carro carro : carros) {
			if (predicate.test(carro))
				carrosFiltrados.add(carro);
		}
		return carrosFiltrados;
	}
	
}
