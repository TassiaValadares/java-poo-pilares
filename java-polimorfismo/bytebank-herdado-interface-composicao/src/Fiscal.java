
public class Fiscal implements Autenticavel {

	
	private SenhaAutenticavel autenticador;
	
	Fiscal() {
		
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
