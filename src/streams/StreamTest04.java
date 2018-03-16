package streams;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Gerando Streams
 * */
public class StreamTest04 {

	public static void main(String[] args) {
		
		//Criando streams de 1 a 49
		IntStream.range(1, 50).forEach(System.out::print);
		
		System.out.println();
		
		//Criando streams de 1 a 50 (rangeClosed considera o ultimo número) 
		IntStream.rangeClosed(1, 50).forEach(System.out::print);
		
		System.out.println();
		
		//Criando um stream como palavras e imprimindo todas maisculas
		Stream<String> streamString = Stream.of("jonatas ", "andre ", "joão");
		streamString.map(String::toUpperCase).forEach(System.out::print);;

		System.out.println();
		
		//Obtendo a média dos números do array
		int[] numeros = {1,2,3,4,5};
		Arrays.stream(numeros).average().ifPresent(System.out::print);
	
		System.out.println();
		
		//lendo linhas do arquivo e imprimindo
		try(Stream<String> linhas = Files.lines(Paths.get("nomes.txt"), Charset.defaultCharset())){
			linhas.forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
}
