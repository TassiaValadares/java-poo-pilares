
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario tassia = new Funcionario(); /*Objeto instanciado, 
		guardando sua referência na variável gerente.*/
		
		// Atributos populados.
		tassia.setNome("Tassia Almeida Valadares");
		
		tassia.setCpf("000.000.000-00");
		
		tassia.setSalario(2600.00);
		
		/*Visualiazação do atributo nome e visualização da bonificação 
		 salárial.*/
		
		System.out.println("Nome do fucionário: " + tassia.getNome());
		
		System.out.println("Gratificação do salário: " + tassia.getBonificacao());
	}
}
