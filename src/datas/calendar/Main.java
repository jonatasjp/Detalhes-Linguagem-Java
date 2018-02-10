package datas.calendar;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		System.out.println(calendar);

		if(Calendar.SUNDAY == calendar.getFirstDayOfWeek())
			System.out.println("domingo");
		
		//obtendo o dia da semana
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		//obtendo o dia do m�s
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		//obtendo o dia do ano
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		
		//retornando um objeto DATE
		System.out.println(calendar.getTime());
	
		//Adicionando 24 horas em cima da data existente
		calendar.add(Calendar.HOUR, 24);
		System.out.println(calendar.getTime());

		//Adiciona uma quantidade de horas, por�m diferentemente do m�todo add, esse m�todo n�o vira o dia
		calendar.roll(Calendar.HOUR, 24);
		System.out.println(calendar.getTime());
		
		
		
		
	
	}
	
}
