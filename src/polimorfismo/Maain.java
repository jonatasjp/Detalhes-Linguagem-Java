package polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Maain {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica("jonatas", "luis", "09700047458", "rua vereador severino deodato, 16.");
		
		PessoaJuridica pj = new PessoaJuridica("jonatas", "luis", "09700047458", "1554597150651");
		
		ProdutorRural pr = new ProdutorRural("jonatas", "luis", "09700047458", "cpr 123165160");
		
		List<Pessoa> p = new ArrayList<>();
		p.add(pf);
		p.add(pj);
		p.add(pr);
		
		for (Pessoa pessoa : p) {
			
//			if(pessoa instanceof PessoaFisica){
//				pf = (PessoaFisica) pessoa;
//				System.out.println(pf.informacoesPersonalizadas());
//			}
//			if (pessoa instanceof PessoaJuridica) {
//				pj = (PessoaJuridica) pessoa;
//				System.out.println(pj.informacoesPersonalizadas());
//			}
//			if (pessoa instanceof ProdutorRural) {
//				pr = (ProdutorRural) pessoa;
//				System.out.println(pr.informacoesPersonalizadas());
//			}
			System.out.println(pessoa.informacoesPersonalizadas());
		}
		
	}
	
}
