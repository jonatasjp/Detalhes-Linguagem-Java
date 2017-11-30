package PackageFora;

import PackageDentro.Pessoa;

public class Maain extends Pessoa{

	public Maain(String nome, String sobrenome) {
		super(nome, sobrenome);
	}
	
	public Maain() {
		super(null, null);
	}

	public int number;
	
	public void ger(){
		Maain m = new Maain();
		m.nome = "sd";
	}
	
	
	
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("", "");
		p.setNome("Jonatas");
		p.setSobrenome("Luis");
		System.out.println(p.nomeCompleto());
		
		Maain m = new Maain();
		m.setNome("Jonatas");
		m.setSobrenome("Luis");
		System.out.println(m.nomeCompleto());
		
	}
	
	@Override
	public String nomeCompleto() {
		return "Seu nome completo é: " +super.nomeCompleto();
	}
	
}

