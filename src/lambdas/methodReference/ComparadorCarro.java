package lambdas.methodReference;

import generics.classes.Carro;

public class ComparadorCarro {
	
	public static int compararPelaCor(Carro carro1, Carro carro2) {
		return carro1.getCor().compareTo(carro2.getCor());
	}
	
	public int compararPeloNome(Carro carro1, Carro carro2) {
		return carro1.getNome().compareTo(carro2.getNome());
	}
}
