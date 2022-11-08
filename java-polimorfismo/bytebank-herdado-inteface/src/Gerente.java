
public class Gerente extends Funcionario implements Autenticavel {

	private int senha;
	
	public double getBonificacao() { /*Possuindo a mesma assinatura do método
	getBonificacao presente na classe Funcionario, somente sendo alterado de acordo
	com a necessidade encontrada na classe Gerente.*/

		return  super.getSalario(); 
		
		/*Este método getBonificacao será invocado no método registra,
		 caso o tipo da referência genérica, se referencie para o 
		 tipo especizado Gerente.*/
		
	}
		
		
		@Override 
		
		public void setSenha(int senha) {
			
			this.senha = senha;
		}
	

		@Override
		public boolean autentica(int senha) {
			
			if(this.senha == senha) {
				
				return true;
			}
			
			return false;
		}
}
