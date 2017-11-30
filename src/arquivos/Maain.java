package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maain {

	public static void main(String[] args) throws IOException {
		
		File arquivo = new File("C:/Users/Jonatas/folhaPagamento.txt");
		Scanner input = new Scanner(arquivo);
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		//processamento para arquivos com o seguinte template:
		//NOME;CARGO;SALARIO EX: Jonatas Luis Lima Nobre;Programador;2000
		while(input.hasNext()){
			try{
				//ler pr�xima linha
				String linha = input.nextLine();
				//separa os dados relativos ao funcionario da linha lida em um array
				String[] funcionarioArray = linha.split(";");
				//instancia um funcionario e seta os dados lidos do array nele
				Funcionario funcionario = new Funcionario();
				funcionario.setNome(funcionarioArray[0]);
				funcionario.setFuncao(funcionarioArray[1]);
				funcionario.setSalario(funcionarioArray[2]);
				//adiciona o funcionario populado a uma lista de funcion�rios
				funcionarios.add(funcionario);
			}catch(Exception e){
				System.out.println("Houve um erro na leitura do arquivo, favor revisar o template do arquivo.");
			}
		}
		//gera sa�da personalizada para cada funcion�rio que foi lido do arquivo.
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	}
}
