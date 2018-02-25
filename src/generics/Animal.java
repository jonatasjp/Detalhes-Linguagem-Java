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
			 * Funciona normalmente no m�todo comentado (fazerAnimaisFazeremBarulho(List<Animal> animaisList)), 
			 * pois a lista de animal aceita receber objetos que s�o instancias de animal, portanto cachorro e gato podem ser adicionados
			 **/
			List<Animal> animaisList = new ArrayList<>();
			animaisList.add(new Gato());
			animaisList.add(new Cachorro());
			fazerAnimaisFazeremBarulho(animaisList);

		   /**
			* N�o funciona para o m�todo comentado que recebe uma lista de animal, pois � necess�rio passar uma lista do mesmo tipo declarado como
			* par�metro do m�todo. Para que isso venha a funcionar � necess�rio informar o caractere coringa(?) informando para o java que o m�todo pode 
			* receber qualquer lista que seja de um tipo de animal, seja a pr�pria lista de animal ou a lista de um dos seus filhos. 
			* */
			List<Gato> gatos = new ArrayList<>();
			gatos.add(new Gato());
			fazerAnimaisFazeremBarulho(gatos);
			
		}

		/**
		 * @see N�o � poss�vel adicionar objetos a lista passada como par�metro com o uso do coringa (? extends Animal) 
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