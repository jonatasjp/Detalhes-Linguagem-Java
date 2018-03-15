package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * Streams especializados (Streams primitivos)
 */
public class StreamTest03 {

	public static void main(String[] args) {

		List<String> palavras = Arrays.asList("Jonatas", "André");
		System.out.println(palavras.stream().map(palavra -> palavra.length()).reduce((x, y) -> x + y).get());
		
		//retornando a soma dos números
		Stream<Integer> stream = getStreamInteger();
		System.out.println(stream.reduce((x, y) -> x + y).get());

		// Para usar um stream que já foi usado com uma operação final é necessário criar o stream novamente
		// Retornando o inteiro, sem a necessidade de usar o optional
		stream = getStreamInteger();
		System.out.println(stream.reduce(0, (x, y) -> x + y));

		// Usando method reference para realizar a mesma operação que foi realizada com o lambda
		stream = getStreamInteger();
		System.out.println(stream.reduce(Integer::sum).get());

		// Usando lambda para retornar o maior número
		stream = getStreamInteger();
		System.out.println(stream.reduce( (x,y) -> x > y ? x : y).get());
		// Usando method reference para retornar o maior número
		stream = getStreamInteger();
		System.out.println(stream.reduce(Integer::max).get());

		//Calculando a soma dos salários das pessoas com salário acima de 4000
		Stream<Pessoa> streamPessoas = Pessoa.bancoDePessoas().stream();
		System.out.println(streamPessoas.filter( p -> p.getSalario() > 4000)
				.map(Pessoa::getSalario)
				.reduce(Double::sum).get());

		//Calculando a média dos salários das pessoas com salário acima de 4000
		streamPessoas = Pessoa.bancoDePessoas().stream();
		System.out.println(streamPessoas.filter( p -> p.getSalario() > 4000)
				.mapToDouble(Pessoa::getSalario)
				.average());

		//Calculando a soma dos salários das pessoas com salário acima de 4000 (stream primitivo)
		streamPessoas = Pessoa.bancoDePessoas().stream();
		System.out.println(streamPessoas.filter( p -> p.getSalario() > 4000)
				.mapToDouble(Pessoa::getSalario)
				.sum());
		
		//Criando um stream especializado e depois retornando ao stream normal
		streamPessoas = Pessoa.bancoDePessoas().stream();
		DoubleStream doubleStream = streamPessoas.filter( p -> p.getSalario() > 4000).mapToDouble(Pessoa::getSalario);
		Stream<Double> streamOriginal = doubleStream.boxed();
	}

	public static Stream<Integer> getStreamInteger() {
		return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream();
	}

}
