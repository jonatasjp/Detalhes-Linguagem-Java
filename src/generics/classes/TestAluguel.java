package generics.classes;

import java.util.ArrayList;
import java.util.List;

public class TestAluguel {
	
	public static void main(String[] args) {
		
		List<Carro> carros = new ArrayList<Carro>();
		carros.add(new Carro("GOL"));
		carros.add(new Carro("FOX"));
		
		Alugaveis<Carro> alugaveis = new Alugaveis<>(carros);
		Carro c = alugaveis.alugar();
		System.out.println("Alugado: " +c);
		alugaveis.exibirDisponiveis();
		alugaveis.devolver(c);
		alugaveis.exibirDisponiveis();
		
		System.out.println(" ------------------------------------------------ ");
		
		List<Barco> barcos = new ArrayList<Barco>();
		barcos.add(new Barco("barco 1"));
		barcos.add(new Barco("barco 2"));
		
		Alugaveis<Barco> alugaveisB = new Alugaveis<>(barcos);
		Barco b = alugaveisB.alugar();
		System.out.println("Alugado: " +b);
		alugaveisB.exibirDisponiveis();
		alugaveisB.devolver(b);
		alugaveisB.exibirDisponiveis();
	}
	
}

class Alugaveis<T> {
	
	private List<T> alugaveis = new ArrayList<>();
	
	public Alugaveis(List<T> alugaveis) {
		this.alugaveis = alugaveis;
	}
	
	public T alugar() {
		T alugavel = this.alugaveis.get(0);
		this.alugaveis.remove(0);
		return alugavel;
	}
	
	public void devolver(T alugavel) {
		this.alugaveis.add(alugavel);
	}
	
	public void exibirDisponiveis(){
		System.out.println(alugaveis);
	}
	
}