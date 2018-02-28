package datas.dateTimeAPI;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTeste {
	
	public static void main(String[] args) {
		
		LocalDateTime localDateTime1 = LocalDateTime.now();
		LocalDateTime localDateTime2 = LocalDateTime.of(2018, Month.APRIL, 28, 23, 0, 0);

		Period p1 = Period.between(localDateTime1.toLocalDate(), localDateTime2.toLocalDate());
		System.out.println(p1);
		
		
		//Criando duration com valores fixos.
		System.out.println(Period.ofDays(10));
		System.out.println(Period.ofMonths(2));
		System.out.println(Period.ofWeeks(5));
		System.out.println(Period.ofYears(1));
		
		
		//usando o UNTIL
		LocalDateTime now = LocalDateTime.now(); 
		//leia as expressões abaixo como:
		
		//para o localDate now, ATÉ(until) o localDate now somado(plusdays)
		//com a quantidade de dias equivalentes a 50 semanas me retorne em meses
		System.out.println("meses: " +now.until(now.plusDays(Period.ofWeeks(50).getDays()), ChronoUnit.MONTHS));
		
		//para o localDate now, ATÉ(until) o localDate now somado(plusdays)
		//com a quantidade de dias equivalentes a 50 semanas me retorne em dias
		System.out.println("dias: " +now.until(now.plusDays(Period.ofWeeks(50).getDays()), ChronoUnit.DAYS));

	}
}
