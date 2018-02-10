package datas.simpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Calendar c = Calendar.getInstance();
		System.out.println(simpleDateFormat.format(c.getTime()));
		
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("'Brasil,' dd 'de' MMMM 'de' yyyy");
		System.out.println(simpleDateFormat2.format(c.getTime()));
	}
}
