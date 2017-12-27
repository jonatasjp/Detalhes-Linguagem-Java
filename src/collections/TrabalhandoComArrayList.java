package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TrabalhandoComArrayList {
	
	public static void main(String[] args) {
		
		String[] cores = {"Azul", "Vermelho", "Rosa", "Preto", "Branco"};
		
		List<String> listaCores = new ArrayList<>();
		
		for (String cor : cores) {
			listaCores.add(cor);
		}
		
		String[] coresARemover = {"Preto", "Branco"};
		List<String> listaCoresARemover = new ArrayList<>();
		
		for (String cor : coresARemover) {
			listaCoresARemover.add(cor);
		}
		
		removerCores(listaCores, listaCoresARemover);
		
		for (String cor : listaCores) {
			System.out.println(cor);
		}
	}

	private static void removerCores(List<String> listaCores, List<String> listaCoresARemover) {
		
		Iterator<String> iterator = listaCores.iterator();
		
		while(iterator.hasNext()) {
			String corAtual = iterator.next();
			if(listaCoresARemover.contains(corAtual)){
				iterator.remove();
			}
		}
	}
}
