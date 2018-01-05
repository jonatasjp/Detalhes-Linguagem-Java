package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrabalhandoComMaps {

	public static void main(String[] args) {
		
		Map<String, Integer> mapaCoresQuantidade = new HashMap<>();
		
		List<String> lista = 
				Arrays.asList("AZUL", "VERMELHO", "BRANCO", "VERDE", "VERMELHO", "AZUL", "VERDE", "AZUL");
	
		for (String cor : lista) {
			if(mapaCoresQuantidade.containsKey(cor)) {
				mapaCoresQuantidade.put(cor, mapaCoresQuantidade.get(cor) + 1);
			} else {
				mapaCoresQuantidade.put(cor, 1);
			}
		}
		
		for (String cor : mapaCoresQuantidade.keySet()) {
			System.out.println("A cor: " +cor +" foi encontrada " +mapaCoresQuantidade.get(cor) +" vezes");
		}
	
	}
}
