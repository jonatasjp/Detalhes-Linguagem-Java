package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TrabalhandoComLinkedList {
	
	public static void main(String[] args) {
		
		String[] cores = {"Azul", "Vermelho", "Rosa", "Preto", "Branco"};
		
		List<String> listaCores = new LinkedList<>();
		
		for (String cor : cores) {
			listaCores.add(cor);
		}
		
		String[] coresARemover = {"Preto", "Branco"};
		List<String> listaCoresARemover = new LinkedList<>();
		
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