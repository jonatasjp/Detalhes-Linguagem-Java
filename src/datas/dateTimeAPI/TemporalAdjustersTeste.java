package datas.dateTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTeste {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//obtendo o próximo ou mesmo domingo. Caso a data já seja um domingo, então o retorno é a própria data
		//caso seja outro dia da semana então irá pegar o próximo dia
		date = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
		//obtendo o próximo domingo. Sempre irá pegar o próximo dia.
		date = date.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
		//obtendo o anterior ou mesmo domingo. Caso a data já seja um domingo, então o retorno é a própria data
		//caso seja outro dia da semana então irá pegar o dia anterior especificado
		date = date.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
		//obtendo o domingo anterior. Sempre irá pegar o anterior especificado.
		date = date.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));
		System.out.println(date);		
		System.out.println(date.getDayOfWeek());
		
		//obtendo o primeiro dia do mes
		date = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
		//obtendo o ultimo dia do mes
		date = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
		//obtendo o primeiro dia do próximo ano
		date = date.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
		date = date.with(new ObterProximoDiaUtil());
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
		date = date.with(new ObterProximoDiaUtil());
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
	}
}
