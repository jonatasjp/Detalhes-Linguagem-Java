package Strings;

public class UsandoStringBuilder {
	
	public static void main(String[] args) {
		
		StringBuilder buffer1 = new StringBuilder(); //Cria stringbuilder com 16 posi��es
		StringBuilder buffer2 = new StringBuilder(10); //Cria stringbuilder com 10 posi��es
		StringBuilder buffer3 = new StringBuilder("hello"); //cria stringbuilder com a string passada + 16 posi��es
		
		System.out.println(buffer1.capacity());
		System.out.println(buffer2.capacity());
		System.out.println(buffer3.capacity());
		
		buffer1.ensureCapacity(50); //aloca capacidade de 50 caracteres
		System.out.println(buffer1.capacity());
		
		buffer3.reverse(); //inverte o ordem dos caracteres do stringbuilder
		System.out.println(buffer3.toString());
		buffer3.reverse();//voltando ao estado original
		
		buffer3.append(" world"); //concatena��o de stringbuilder
		System.out.println(buffer3);
		
	}
}
