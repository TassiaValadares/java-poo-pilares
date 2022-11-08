
public class Gerente extends Funcionario {

	private int senha;

	public void setSenha(int senha) {

		this.senha = senha;
	}

	public boolean autenticacao(int senha) {  

		if (this.senha == senha) { 
			return true;
		}
		return false;

	}

	public double getBonificacao() { /*Possuindo a mesma assinatura do método
	getBonificacao presente na classe Funcionario, somente sendo alterado de acordo
	com a necessidade encontrada na classe Gerente.*/

		return super.getBonificacao() + super.getSalario(); /*É possível invocar 
		métodos da super classe, para serem utilizados na classe filha.*/
		
		
		/*Este método getBonificacao será invocado no método registra,
		 caso o tipo da referência genérica, se referencie para o 
		 tipo especizado Gerente.*/
	}

}
