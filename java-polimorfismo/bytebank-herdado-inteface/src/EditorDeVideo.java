

	public class EditorDeVideo extends Funcionario {

	
		public double getBonificacao() { /*Possuindo a mesma assinatura do método
		getBonificacao presente na classe Funcionario, somente sendo alterado de acordo
		com a necessidade encontrada na classe Gerente.*/

			return 150;
			
			/*Este método getBonificacao será invocado no método registra,
			 caso o tipo da referência genérica, se referencie para o 
			 tipo especizado EditorDeVideo.*/
		}

	}


