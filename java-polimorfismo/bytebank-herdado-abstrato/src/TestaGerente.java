
public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();/*Objeto instanciado, guardando
		sua referência na variável gerente.*/
		
		//Atributos populados.
		gerente.setNome("Tassia Almeida Valadares");
		gerente.setCpf("000.000.000-00");
		gerente.setSalario(5000);
		
		/* Variável do tipo boolean, possibilita retornar true ou false
		 do método autenticacao.*/
		boolean autenticou = gerente.autentica(1928);
		
		// Visualizando o que está polulado no atributo nome.
		System.out.println("Nome do(a) gerente: " + gerente.getNome());
		// Visualizando o retorno do método autenticacao.
		System.out.println("Autenticou: " + autenticou);
		
	}
}
