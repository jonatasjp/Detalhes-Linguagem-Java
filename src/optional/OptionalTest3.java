package optional;

public class OptionalTest3 {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		System.out.println(obterNomeSeguradora(p));
		
		Carro c = new Carro();
		p.setCarro(c);
		Seguradora s = new Seguradora();
		c.setSeguradora(s);
		s.setNome("seguradora abc");
		
		System.out.println(obterNomeSeguradora(p));
	}
	
	public static String obterNomeSeguradora(Pessoa pessoa) {
		return pessoa.getCarro().flatMap(Carro::getSeguradora).map(Seguradora::getNome).orElse(null);
	}
}
