package lambdas.methodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

import generics.classes.Carro;

public class MethodReference {

	public static void main(String[] args) {
		
		List<Carro> carros = Arrays.asList(new Carro("gol", "vermelho"), new Carro("bmw", "preto"),
				new Carro("gol", "amarelo"), new Carro("jetta", "vermelho"));

		// refer�ncia a m�todo est�tico
		Collections.sort(carros, ComparadorCarro::compararPelaCor);
		System.out.println(carros);
		
		// refer�ncia de m�todo para um m�todo de inst�ncia de um objeto de um tipo espec�fico.
		ComparadorCarro comparador = new ComparadorCarro();
		Collections.sort(carros, comparador::compararPeloNome);
		System.out.println(carros);
		
		//Refer�ncia a um m�todo de inst�ncia de um objeto arbitr�rio de um tipo espec�fico
		List<String> nomes = Arrays.asList("jonatas", "andr�", "joao", "railda");
		nomes.sort(String::compareTo);
		System.out.println(nomes);
		
		Function<String, Integer> stringParaInteger = Integer::parseInt;
		System.out.println(stringParaInteger.apply("5"));
		
		BiPredicate<List<String>, String> contains = List::contains;
		System.out.println(contains.test(nomes, "jonatas"));
		
		//Refer�ncia a um construtor
		Supplier<ComparadorCarro> comparadorCarro = ComparadorCarro::new;
		//Instancia do comparador
		System.out.println(comparadorCarro.get());
		
	}
	
}
