package datas.dateTimeAPI;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class OutrosMetodosDateTimeAPI {
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.of(2018, Month.FEBRUARY, 25);
		System.out.println(localDate);
		
		//mudando o ano
		localDate = localDate.withYear(2019);
		System.out.println(localDate);
		
		//mudando o mes
		localDate = localDate.withMonth(Month.MARCH.getValue());
		System.out.println(localDate);
	
		//mudando o dia do mes
		localDate = localDate.withDayOfMonth(20);
		System.out.println(localDate);
		
		//mudando o dia do mes de outra forma
		localDate = localDate.with(ChronoField.DAY_OF_MONTH, 19);
		System.out.println(localDate);
		
		//adicionando dias a data
		localDate = localDate.plusDays(13);
		System.out.println(localDate);

		//adicionando dias a data de outra forma
		localDate = localDate.plus(2, ChronoUnit.DAYS);
		System.out.println(localDate);
		
		//adicionando meses a data
		localDate = localDate.plusMonths(3);
		System.out.println(localDate);
		
		//adicionando dois meses e retirando 5 dias
		localDate = localDate.plusMonths(2).minusDays(5);
		System.out.println(localDate);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		//mudando a hora para 10
		time = time.with(ChronoField.HOUR_OF_DAY, 10);
		System.out.println(time);
		
		//adicionando 10 minutos
		time = time.plus(Duration.ofMinutes(10L));
		System.out.println(time);
		
		//adicionando 10 minutos
		time = time.plusMinutes(10);
		System.out.println(time);
	}
}
