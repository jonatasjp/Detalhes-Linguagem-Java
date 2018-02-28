package datas.dateTimeAPI;

import java.time.LocalTime;

public class LocalTimeTeste {
	
	public static void main(String[] args) {
		
		LocalTime localTime = criandoUmLocalTime();
		
		imprimindoHoraMinutoESegundo(localTime);
		
		imprimindoMaximoEMinimo();
		
		realizandoOParseDeStringParaLocalTime();
	}

	public static void realizandoOParseDeStringParaLocalTime() {
		LocalTime localTimeParseado = LocalTime.parse("23:59:59");
		System.out.println(localTimeParseado);
	}

	public static void imprimindoMaximoEMinimo() {
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);
	}

	public static void imprimindoHoraMinutoESegundo(LocalTime localTime) {
		System.out.println(localTime.getHour());
		System.out.println(localTime.getMinute());
		System.out.println(localTime.getSecond());
	}

	public static LocalTime criandoUmLocalTime() {
		LocalTime localTime = LocalTime.of(23, 59, 59);
		System.out.println(localTime);
		return localTime;
	}
	
}
