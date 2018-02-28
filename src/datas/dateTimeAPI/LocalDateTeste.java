package datas.dateTimeAPI;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTeste {
	
	public static void main(String[] args) {
		
		obtendoADataDeAgora();
		
		criandoUmaDataEObtendoValoresRelativosAAnoMesEDia();
		
		verificandoSeEhAnoBisexto();
		
		obtendoValoresRelativosAAnoMesEDia();
		
		realizandoParseDeStringParaLocalDate();
		
		obtendoDataInicialEFinalDeUmDeterminadoMes();
		
	}

	public static void obtendoDataInicialEFinalDeUmDeterminadoMes() {
		LocalDate initial = LocalDate.of(2018, 2, 25);
//		LocalDate inicio = initial.withDayOfMonth(1);
//		LocalDate fim = initial.withDayOfMonth(initial.lengthOfMonth());
		LocalDate inicio = initial.with(TemporalAdjusters.firstDayOfMonth());
		LocalDate fim = initial.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(inicio);
		System.out.println(fim);
	}

	public static void realizandoParseDeStringParaLocalDate() {
		LocalDate localDateParseado = LocalDate.parse("2018-02-21");
		System.out.println(localDateParseado);
	}

	public static void obtendoValoresRelativosAAnoMesEDia() {
		LocalDate localDate = LocalDate.of(2018, Month.FEBRUARY, 21);
		
		System.out.println(localDate.get(ChronoField.YEAR));
		System.out.println(localDate.get(ChronoField.MONTH_OF_YEAR));
		System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));
	}

	public static void verificandoSeEhAnoBisexto() {
		LocalDate localDate = LocalDate.of(2018, Month.FEBRUARY, 21);
		System.out.println(localDate.isLeapYear());
	}

	public static void criandoUmaDataEObtendoValoresRelativosAAnoMesEDia() {
		LocalDate localDate = LocalDate.of(2018, Month.FEBRUARY, 21);
		System.out.println(localDate.getYear());
		System.out.println(localDate.getMonth());
		System.out.println(localDate.getMonthValue());
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getDayOfYear());
	}

	public static void obtendoADataDeAgora() {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
	}
}
