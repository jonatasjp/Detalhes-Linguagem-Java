package datas.dateTimeAPI;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTeste {
	
	public static void main(String[] args) {
		
		Instant agora = Instant.now();
		//hora UTC
		System.out.println(agora);
		//hora da máquina
		System.out.println(LocalDateTime.now());
		
		System.out.println(agora.getEpochSecond());
		System.out.println(agora.getNano());
		
		//Ajustes em segundos para a data base (1970) 
		//e ajustes em nano segundos para a quantidade de segundos informado no 1º parametro
		System.out.println(Instant.ofEpochSecond(3));
		System.out.println(Instant.ofEpochSecond(2, 1_000_000_000));
		System.out.println(Instant.ofEpochSecond(4, -1_000_000_000));
		
	}
}
