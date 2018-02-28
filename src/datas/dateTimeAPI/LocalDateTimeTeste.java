package datas.dateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTeste {
	
	public static void main(String[] args) {
	
		criandoLocalDateTimeAgora();
		
		criandoLocalDateTimeComValores();
		
		realizandoOParseDeStringParaLocalDateTime();
		
		inserindoHoraEmLocalDateERetornandoLocalDateTime();
		
		inserindoDataEmLocalTimeERetornandoLocalDateTime();
	}

	public static void inserindoDataEmLocalTimeERetornandoLocalDateTime() {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime localDateTime2 = time.atDate(date);
		System.out.println(localDateTime2);
	}

	public static void inserindoHoraEmLocalDateERetornandoLocalDateTime() {
		LocalDate date = LocalDate.now();
		LocalDateTime localDateTime2 = date.atTime(LocalTime.now());
		System.out.println(localDateTime2);
	}

	public static void realizandoOParseDeStringParaLocalDateTime() {
		LocalDateTime parseado = LocalDateTime.parse("2018-02-25T15:42:38.650");
		System.out.println(parseado);
	}

	public static void criandoLocalDateTimeComValores() {
		LocalDateTime localDateTime;
		localDateTime = LocalDateTime.of(2018, Month.FEBRUARY, 25, 15, 45, 30);
		System.out.println(localDateTime);
	}

	public static void criandoLocalDateTimeAgora() {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
	}
	
	
}
