package datas.dateFormat;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		DateFormat[] datesFormat = new DateFormat[6]; 
		
		//criando dateFormat em diversos formatos;
		datesFormat[0] = DateFormat.getInstance();
		datesFormat[1] = DateFormat.getDateInstance();
		datesFormat[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		datesFormat[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		datesFormat[4] = DateFormat.getDateInstance(DateFormat.LONG);
		datesFormat[5] = DateFormat.getDateInstance(DateFormat.FULL);
		
		for (int i = 0; i < datesFormat.length; i++) {
			System.out.println(datesFormat[i].format(c.getTime()));
		}		
		
		//Utilizando date format com Locale
		Locale[] arrayLocale = new Locale[3];
		arrayLocale[0] = new Locale("pt", "BR");
		arrayLocale[1] = new Locale("it", "IT");
		arrayLocale[2] = new Locale("en", "US");
		
		for (int i = 0; i < arrayLocale.length; i++) {
			
			datesFormat[2] = DateFormat.getDateInstance(DateFormat.SHORT, arrayLocale[i]);
			datesFormat[3] = DateFormat.getDateInstance(DateFormat.MEDIUM, arrayLocale[i]);
			datesFormat[4] = DateFormat.getDateInstance(DateFormat.LONG, arrayLocale[i]);
			datesFormat[5] = DateFormat.getDateInstance(DateFormat.FULL, arrayLocale[i]);
		
			for (int j = 2; j < datesFormat.length; j++) {
				System.out.println("data em " +arrayLocale[i].getDisplayLanguage() +": " +datesFormat[j].format(c.getTime()));
			}

		}

		//setando uma data em um calendar
		c.set(2018, Calendar.JUNE, 10);
		System.out.println(DateFormat.getDateInstance(DateFormat.SHORT, arrayLocale[0]).format(c.getTime()));
		
	}
}
