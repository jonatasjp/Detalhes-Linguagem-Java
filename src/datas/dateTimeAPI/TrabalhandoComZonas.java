package datas.dateTimeAPI;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

public class TrabalhandoComZonas {
	
	public static void main(String[] args) {
		
		//Exibindo todas as zonas
		for(Map.Entry<String, String> entry : ZoneId.SHORT_IDS.entrySet()) {
			System.out.println(entry.getKey() +" " +entry.getValue());
		}
		
		//Obtendo a zona default do sistema. (no meu caso America/Sao_Paulo)
		System.out.println(ZoneId.systemDefault());
		
		LocalDateTime localDateTime = LocalDateTime.now();
		ZonedDateTime zone = localDateTime.atZone(ZoneId.systemDefault());
		System.out.println(zone);
		
		Instant instant = Instant.now();
		zone = instant.atZone(ZoneId.systemDefault());
		System.out.println(zone);
	}
}
