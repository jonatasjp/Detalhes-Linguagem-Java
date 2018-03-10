package streams;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Map e FlatMap
 */
public class StreamTest01 {

	public static void main(String[] args) throws IOException {

		
		List<List<String>> nomes = Arrays.asList(Arrays.asList("jonatas", "andre"), Arrays.asList("jonatas", "andre"));
		System.out.println(nomes.stream().flatMap(lista -> lista.stream()).collect(Collectors.toList()));
		System.out.println(nomes.stream().flatMap(Collection::stream).collect(Collectors.toList()));
		
		List<String> palavras = Arrays.asList("Jonatas", "André");
		//Fazendo a mesma coisa de dois modos diferentes
		//basicamente transforma a lista de palavras em uma lista de strings com os caracteres das palavras
		palavras.stream().flatMap( palavra -> Arrays.stream(palavra.split(""))).collect(Collectors.toList());
		palavras.stream().map( palavra -> palavra.split("")).flatMap(Arrays::stream);
		
		System.out.println(palavras.stream().map( palavra -> palavra.split("")).flatMap(Arrays::stream).collect(Collectors.toList()));
		
		System.out.println(palavras.stream().map(palavra -> palavra.length()).flatMapToInt( quantidade -> IntStream.of(quantidade)).sum());
	
	}
	
}
