
public class ControleBonificacao {

	private double soma;
	
	public void registra(Funcionario funcionario) { /*O tipo de
	referência funcionario é genérica, apontando também 
	para suas classes filhs. */
		
		double bonificacao = funcionario.getBonificacao(); /*Como temos no 
		método registra, um método reescrito em outras classes herdeiras, 
        podemos invocar esses comportamentos específicos, no método 
        registra, mas sem reescrever o registra diversas vezes
        para cada especilidade.*/
		
	    this.soma += bonificacao; /*O valor da variável bonificacao, será
	    atribuido junto ao valor já existente, no atributo soma.*/
	}

	
	public double getSoma() {  /*Método getSoma, para visualizar o valor
	do atributo soma.*/
		
		return this.soma; 
		
	}
}
