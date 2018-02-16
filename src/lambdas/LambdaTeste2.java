package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTeste2 {
	
	public static void main(String[] args) {
		
		testarConsumer(Arrays.asList("Jonatas", "André", "João"), (nome) -> System.out.println(nome));
		
		Arrays.asList("Jonatas", "André", "João").forEach((nome) -> System.out.println(nome));
		
		Function<String, Integer> function = (nome) -> nome.length();
		System.out.println(function.apply("jonatas"));
		System.out.println(function.apply("andré"));
		System.out.println(function.apply("joão"));
		
		Function<String, String> function2 = (nome) -> reverse(nome);
		System.out.println(function2.apply("andré"));
		System.out.println(function2.apply("joão"));
		
		Function<String, String> function3 = (nome) -> {return nome.equals("Jonatas") ? nome : null;};
		
		List<String> lista = Arrays.asList("Jonatas", "André", "João");
		List<String> filtrados = new ArrayList<String>();
		for (String string : lista) {
			if(function3.apply(string) != null)
				filtrados.add(string);
		}
		System.out.println(filtrados);
		
		System.out.println(filtrosComFunctionLambda(lista, (nome) -> filtrar(nome)));
	}

	public static String filtrar(String nome) {
		return nome.equals("Jonatas") || nome.equals("André") ? nome : null;
	}
	
	public static <T> List<T> filtrosComFunctionLambda(List<T> lista, Function<T, T> function) {
		List<T> listaFiltrada = new ArrayList<>();
		
		for(T t : lista) {
			T valor = function.apply(t);
			if(valor != null)
				listaFiltrada.add(valor);
		}
		
		return listaFiltrada;
	}
	
	public static String reverse(String nome) {
		return new StringBuilder(nome).reverse().toString();
	}
	
	public static <T> void testarConsumer(List<T> lista, Consumer<T> consumer) {
		for (T t : lista) {
			consumer.accept(t);
		}
	}
	
}
