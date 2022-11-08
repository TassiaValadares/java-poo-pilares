
public class SistemaInterno {

	private int senha = 2222;
	
	/* O método autentica, se referência com um tipo genérico, sendo
	 possibilitado esse polimorfismo pela interface.*/
	public void autentica(Autenticavel autenticavel ) {
		
		boolean autenticou = autenticavel.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Não pode entrar no sistema!");
		}
	}
}
