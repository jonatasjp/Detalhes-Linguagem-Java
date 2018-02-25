package inner_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import generics.classes.Carro;

class Animal {
	
	public void andar(){
		System.out.println("andando");
	}
}
public class ClasseAnonimaTest {

	public static void main(String[] args) {
		Animal a = new Animal() {
			@Override
			public void andar() {
				System.out.println("andando anonimo");
			}
		};
		a.andar();
		
		List<Carro> carros = new ArrayList<>();
		carros.add(new Carro("bmw"));
		carros.add(new Carro("audi"));
		
		Collections.sort(carros, new Comparator<Carro>() {
			@Override
			public int compare(Carro o1, Carro o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
		
		carros.forEach(System.out::println);
	}
	
}
