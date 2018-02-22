package datas.dateTimeAPI;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class DateTimeTeste {
	
	public static void main(String[] args) {
		
		obtendoADataDeAgora();
		
		criandoUmaDataEObtendoValoresRelativosAAnoMesEDia();
		
		verificandoSeEhAnoBisexto();
		
		obtendoValoresRelativosAAnoMesEDia();
		
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
