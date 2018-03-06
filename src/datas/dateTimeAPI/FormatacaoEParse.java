package datas.dateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatacaoEParse {
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		
		//Formatando LocalDate para String
		System.out.println(localDate.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(localDate.format(DateTimeFormatter.ISO_DATE));
		System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
		
		//Formatando Strings para LocalDate
		LocalDate dataParseada = LocalDate.parse("2018-03-05");
		System.out.println(dataParseada);
		
		dataParseada = LocalDate.parse("20180305", DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(dataParseada);
		
		LocalDateTime dateTimeParseada = LocalDateTime.parse("2018-03-05T21:55:00", DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(dateTimeParseada);
		
		//formatando para o formato brasileiro
		DateTimeFormatter formaterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dateTimeParseada.format(formaterBR));
		
		formaterBR = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", new Locale("pt", "BR"));
		System.out.println(dateTimeParseada.format(formaterBR));
		
		formaterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("pt", "BR"));
		System.out.println(LocalDate.parse("05/03/2018", formaterBR));
	}
}
