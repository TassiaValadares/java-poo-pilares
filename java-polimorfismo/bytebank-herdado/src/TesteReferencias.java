
public class TesteReferencias {

	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente(); /*Objeto instanciado, 
		guardando  sua referência na variável gerente, onde é de um 
		tipo genérico.*/
		
		// Atributos  populados
		gerente.setNome("Marina Costa");
		gerente.setSalario(5000.0);
		
		Funcionario funcionario = new Funcionario(); /*Objeto instanciado, 
		guardando sua referência na variável funcionario.*/
		
		
		funcionario.setSalario(2000.0);
		
		Funcionario editor = new EditorDeVideo(); /*Objeto instanciado, 
		guardando  sua referência na variável editor, onde é de um 
		tipo genérico.*/
		
		editor.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();/*Objeto 
		instanciado, guardando sua referência na variável controle.*/
		
		/*Método registra, chamando as referências apontadas.*/
		controle.registra(gerente); 
		controle.registra(funcionario);
		controle.registra(editor);
		
		System.out.println(controle.getSoma());/*São somados todos os 
		vslores obtidos pelo método registra, sendo possível ver 
		o total pelo getSoma.*/ 
	}
	
	
	
}
