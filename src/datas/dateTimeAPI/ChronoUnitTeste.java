package datas.dateTimeAPI;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTeste {
	
	public static void main(String[] args) {
		
		LocalDateTime dataNascimento = LocalDateTime.of(1993, 11, 9, 0, 0, 0);
		
		//Calculando dias entre data nascimento e agora
		System.out.println(ChronoUnit.DAYS.between(dataNascimento, LocalDateTime.now()));

		//Calculando semanas entre data nascimento e agora
		System.out.println(ChronoUnit.WEEKS.between(dataNascimento, LocalDateTime.now()));
		
		//Calculando meses entre data nascimento e agora
		System.out.println(ChronoUnit.MONTHS.between(dataNascimento, LocalDateTime.now()));
		
		//Calculando anos entre data nascimento e agora
		System.out.println(ChronoUnit.YEARS.between(dataNascimento, LocalDateTime.now()));
	
	}
}
