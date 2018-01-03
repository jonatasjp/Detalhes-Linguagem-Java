package collections;

import java.util.Stack;

public class TrabalhandoComStack {
	
	public static void main(String[] args) {
		
		Stack<Integer> pilha = new Stack<>();
		
		//EMPILHANDO
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.push(4);
		pilha.push(5);
		
		//EXIBINDO VALORES EMPILHADOS
		for (Integer valor : pilha) {
			System.out.println(valor);
		}
		
		System.out.println("---------------");
		
		//DESEMPILHANDO
		while(!pilha.isEmpty()) {
			System.out.println(pilha.pop());
		}

		//EMPILHANDO NOVAMENTE
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.push(4);
		pilha.push(5);

		System.out.println("---------------");
		
		//DESEMPILHANDO 2º forma
		while(!pilha.isEmpty()) {
			System.out.println(pilha.peek());
			pilha.pop();
		}
		
		
	}
}
