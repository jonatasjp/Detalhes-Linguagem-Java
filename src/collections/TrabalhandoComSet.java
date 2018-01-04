package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TrabalhandoComSet {

	public static void main(String[] args) {

		//array com cores repetidas
		String [] cores = {"azul", "verde", "branco"};
		
		//criando uma lista a partir do array
		List<String> listaCores = Arrays.asList(cores);
		
		imprimirColecaoSemDuplicacao(listaCores);
		
		SortedSet<String> sortedSetCores = new TreeSet<>(listaCores);
		
		for (String cor : sortedSetCores) {
			System.out.println(cor);
		}
		
		for (String cor : sortedSetCores.headSet("branco")) {
			System.out.println(cor);
		}

		for (String cor : sortedSetCores.tailSet("branco")) {
			System.out.println(cor);
		}
	}

	public static void imprimirColecaoSemDuplicacao(List<String> listaCores) {
		//removendo os elementos duplicados com o SET
		Set<String> setCores = new HashSet<>(listaCores);
		
		//imprimindo os elementos do set sem duplica��o
		for (String cor : setCores) {
			System.out.println(cor);
		}
	}
}
