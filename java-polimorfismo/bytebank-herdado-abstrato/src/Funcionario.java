
public abstract class Funcionario {

	private String nome;
	private String cpf;
	//protected double salario; Público somente para os filhos da classe.
	protected double salario;
	
	
	public abstract double getBonificacao(); // 
		
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public String getNome() {
		
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		
		this.cpf = cpf;
	}
	
	public String getCpf() {
		
		return this.cpf;
	}
	
	public void setSalario(double salario) {
		
		this.salario = salario;
	}
	
	public double getSalario() {
		
		return this.salario;
	}
}
