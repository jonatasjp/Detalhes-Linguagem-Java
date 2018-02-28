package datas.dateTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTeste {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//obtendo o pr�ximo ou mesmo domingo. Caso a data j� seja um domingo, ent�o o retorno � a pr�pria data
		//caso seja outro dia da semana ent�o ir� pegar o pr�ximo dia
		date = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
		//obtendo o pr�ximo domingo. Sempre ir� pegar o pr�ximo dia.
		date = date.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
		//obtendo o anterior ou mesmo domingo. Caso a data j� seja um domingo, ent�o o retorno � a pr�pria data
		//caso seja outro dia da semana ent�o ir� pegar o dia anterior especificado
		date = date.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
		//obtendo o domingo anterior. Sempre ir� pegar o anterior especificado.
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
		
		//obtendo o primeiro dia do pr�ximo ano
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
