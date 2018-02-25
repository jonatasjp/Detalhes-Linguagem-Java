package generics;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

	public abstract void fazerBarulho();

	public static class AnimalTest {
		
		public static void main(String[] args) {
			Animal[] animais = {new Gato(), new Cachorro()};
			fazerAnimaisFazeremBarulho(animais);
			
			/**
			 * Funciona normalmente no método comentado (fazerAnimaisFazeremBarulho(List<Animal> animaisList)), 
			 * pois a lista de animal aceita receber objetos que são instancias de animal, portanto cachorro e gato podem ser adicionados
			 **/
			List<Animal> animaisList = new ArrayList<>();
			animaisList.add(new Gato());
			animaisList.add(new Cachorro());
			fazerAnimaisFazeremBarulho(animaisList);

		   /**
			* Não funciona para o método comentado que recebe uma lista de animal, pois é necessário passar uma lista do mesmo tipo declarado como
			* parâmetro do método. Para que isso venha a funcionar é necessário informar o caractere coringa(?) informando para o java que o método pode 
			* receber qualquer lista que seja de um tipo de animal, seja a própria lista de animal ou a lista de um dos seus filhos. 
			* */
			List<Gato> gatos = new ArrayList<>();
			gatos.add(new Gato());
			fazerAnimaisFazeremBarulho(gatos);
			
		}

		/**
		 * @see Não é possível adicionar objetos a lista passada como parâmetro com o uso do coringa (? extends Animal) 
		 */
		private static void fazerAnimaisFazeremBarulho(List<? extends Animal> animaisList) {
			for (Animal animal : animaisList) {
				animal.fazerBarulho();
			}
		}

//		private static void fazerAnimaisFazeremBarulho(List<Animal> animaisList) {
//			for (Animal animal : animaisList) {
//				animal.fazerBarulho();
//			}
//		}
		
		private static void fazerCachorrosFalarem(List<? super Cachorro> animaisList) {
		}

		private static void fazerAnimaisFazeremBarulho(Animal[] animais) {
			for (Animal animal : animais) {
				animal.fazerBarulho();
			}
		}
		
		
		
	}
	
}

class Cachorro extends Animal {

	@Override
	public void fazerBarulho() {
		System.out.println("au au");
	}
}

class Gato extends Animal {

	@Override
	public void fazerBarulho() {
		System.out.println("miau");
	}
}