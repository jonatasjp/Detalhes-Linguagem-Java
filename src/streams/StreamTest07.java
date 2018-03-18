package streams;

import java.util.stream.LongStream;

/**
 * Parallel Streams
 * */
public class StreamTest07 {

	public static void main(String[] args) {
		
		Long num = 10_000_000_000L;
		
		long inicio = System.currentTimeMillis();
		System.out.println(LongStream.rangeClosed(1, num).parallel().reduce(0L, Long::sum));
		long fim = System.currentTimeMillis();
		System.out.println(fim - inicio);
		
//		inicio = System.currentTimeMillis();
//		System.out.println(LongStream.rangeClosed(1, num).reduce(0L, Long::sum));
//		fim = System.currentTimeMillis();
//		System.out.println(fim - inicio );

		inicio = System.currentTimeMillis();
		long soma = 0;
		for (long i = 1L; i <= num; i++) {
			soma += i;
		}
		System.out.println(soma);
		fim = System.currentTimeMillis();
		System.out.println(fim - inicio );
	}
}
