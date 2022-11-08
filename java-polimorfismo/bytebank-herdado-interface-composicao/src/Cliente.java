
public class Cliente implements  Autenticavel {

	
	private SenhaAutenticavel autenticador; /*A Variável autenticador, 
	somente aceita referência do tipo SenhaAuticavel, faxendo uma
	composição de objetos.*/
	
	Cliente() { /* O objeto Cliente, já nascerá com o objeto
		senhaAutenticavel instânciado nele.*/
		
		this.autenticador = new SenhaAutenticavel();
	}
	
	@Override
	public void setSenha(int senha) {
	
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		
		return this.autenticador.autentica(senha);
	}
}
