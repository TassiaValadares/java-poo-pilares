
public class Administrador extends Funcionario implements Autenticavel{
	
	
	private SenhaAutenticavel autenticador;
	
	Administrador() {
		
		this.autenticador = new SenhaAutenticavel();
	}
	
	@Override 
	public double getBonificacao() {
		
		return 50;
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
