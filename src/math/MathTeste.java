package math;

public class MathTeste {
	
	public static void main(String[] args) {
		
		//retorna o valor absoluto
		System.out.println(Math.abs(-30) );
		
		//arredondamento para cima
		System.out.println(Math.ceil(9.1));
		//arredondamento para baixo
		System.out.println(Math.floor(9.9));
		
		//arredondamento de acordo com o mais proximo, seja para cima ou para baixo
		System.out.println(Math.round(9.4));
		System.out.println(Math.round(9.5));
	}
}
