package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class TrabalhandoComMaps {

	public static void main(String[] args) {
		
		Map<String, Integer> mapaCoresQuantidade = new HashMap<>();
		
		List<String> lista = 
				Arrays.asList("AZUL", "VERMELHO", "BRANCO", "VERDE", "VERMELHO", "AZUL", "VERDE", "AZUL");
	
		popularMapa(mapaCoresQuantidade, lista);

		imprimirMapa(mapaCoresQuantidade);
		
		imprimirMapaOrdenado(mapaCoresQuantidade);
	
	}

	public static void imprimirMapaOrdenado(Map<String, Integer> mapaCoresQuantidade) {
		SortedSet<String> sortedKeys = new TreeSet<>(mapaCoresQuantidade.keySet());
		
		System.out.println("--------------------------");
		for (String cor : sortedKeys) {
			System.out.println("A cor: " +cor +" foi encontrada " +mapaCoresQuantidade.get(cor) +" vezes");
		}
	}

	public static void imprimirMapa(Map<String, Integer> mapaCoresQuantidade) {
		for (String cor : mapaCoresQuantidade.keySet()) {
			System.out.println("A cor: " +cor +" foi encontrada " +mapaCoresQuantidade.get(cor) +" vezes");
		}
	}

	public static void popularMapa(Map<String, Integer> mapaCoresQuantidade, List<String> lista) {
		for (String cor : lista) {
			if(mapaCoresQuantidade.containsKey(cor)) {
				mapaCoresQuantidade.put(cor, mapaCoresQuantidade.get(cor) + 1);
			} else {
				mapaCoresQuantidade.put(cor, 1);
			}
		}
	}
}
