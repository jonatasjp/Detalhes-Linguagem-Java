package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrabalhandoComSet {

	public static void main(String[] args) {

		//array com cores repetidas
		String [] cores = {"azul", "verde", "branco", "azul", "branco", "verde", "azul"};
		
		//criando uma lista a partir do array
		List<String> listaCores = Arrays.asList(cores);
		
		//removendo os elementos duplicados com o SET
		Set<String> setCores = new HashSet<>(listaCores);
		
		//imprimindo os elementos do set sem duplicação
		for (String cor : setCores) {
			System.out.println(cor);
		}
		
	}
}
