package datas.dateTimeAPI;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DurationTeste {
	
	/**
	 * Não é possível usar duration com localDate, é possível apenas com LocalDateTime e LocalTime
	 * Também não deve ser misturado LocalDateTime com LocalTime
	 * */
	public static void main(String[] args) {

		LocalDateTime localDateTime1 = LocalDateTime.now();
		LocalDateTime localDateTime2 = LocalDateTime.of(2018, Month.FEBRUARY, 28, 23, 0, 0);
		Duration duration1 = Duration.between(localDateTime1, localDateTime2);
		System.out.println(duration1);
		
		LocalTime localTime1 = LocalTime.now();
		LocalTime localTime2 = LocalTime.of(20, 25, 30);
		Duration duration2 = Duration.between(localTime1, localTime2);
		System.out.println(duration2);
		
		//Criando duration com valores fixos.
		System.out.println(Duration.ofMinutes(3));
		System.out.println(Duration.ofSeconds(60));
		System.out.println(Duration.ofDays(2));
		System.out.println(Duration.ofHours(24));
		System.out.println(Duration.ofMillis(1000000));
		System.out.println(Duration.ofNanos(1_000_000_000));
		
	}
}
