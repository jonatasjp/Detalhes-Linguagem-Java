package generics.classes;

import java.util.ArrayList;
import java.util.List;

public class MeioDeTransporte {

	public static void main(String[] args) {
		
		List<Carro> carros = new ArrayList<Carro>();
		carros.add(new Carro("GOL"));
		carros.add(new Carro("FOX"));

		Alugaveis<Carro> alugaveis = new Alugaveis<>(carros);
		
		List<Barco> barcos = new ArrayList<Barco>();
		barcos.add(new Barco("barco 1"));
		barcos.add(new Barco("barco 2"));
		
		Alugaveis<Barco> alugaveisB = new Alugaveis<>(barcos);
		
		exibirMeiosDeTransporte(alugaveis);
		exibirMeiosDeTransporte(alugaveisB);
	}
	
	public static void exibirMeiosDeTransporte(Alugaveis<? extends MeioDeTransporte> alugaveis) {
		alugaveis.exibirDisponiveis();
	}
}
