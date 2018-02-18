package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import generics.classes.Carro;

public class LambdaTeste3 {
	
	public static void main(String[] args) {
		
		Filtro<Carro, String> filtro = (carro) -> carro.getCor();
		
		List<Carro> carros = Arrays.asList(new Carro("gol", "vermelho"), new Carro("bmw", "preto"),
				new Carro("gol", "amarelo"), new Carro("jetta", "vermelho"));
		
		System.out.println(teste(carros, filtro));
		
		String teste = "dddd"; 
		List<String> strings = Arrays.asList("aaaa", "bbbb", "cccc");
		Consumer<String> consumerst = (c) -> strings.add(teste);
		consumerst.accept(teste);
		//Não é possível alterar o valor da variável LOCAL que está sendo utilizada no lambda, pois a mesma tem que ser final ou efetivamente final
		//teste = "eeee";
	}
	
	public static <T, R> List<R> teste(List<T> lista, Filtro<T, R> filtro) {
		List<R> listaRetorno = new ArrayList<>();
		
		for (T objeto : lista) {
			listaRetorno.add(filtro.filtrar(objeto));
		}
		
		return listaRetorno;
	}
	
}
