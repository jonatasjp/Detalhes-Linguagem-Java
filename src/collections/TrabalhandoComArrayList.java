package collections;

import java.util.ArrayList;
import java.util.List;

public class TrabalhandoComArrayList {
	
	public static void main(String[] args) {
		
		String[] cores = {"Azul", "Vermelho", "Rosa", "Preto", "Branco"};
		
		List<String> listaCores = new ArrayList<>();
		
		for (String cor : cores) {
			listaCores.add(cor);
		}
		
		
	}
}
