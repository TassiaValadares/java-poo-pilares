// Uma classe abstrata, se tornou um conceito e não pode ser instânciada.
public abstract class Conta {

	private int agencia;
	private int numero;
	protected double saldo;
	private Cliente titular;
	private static int total = 0;

	Conta(int agencia, int numero) {

		Conta.total++;
		System.out.println("Quantas contas existem: " + Conta.getTotal());
		setAgencia(agencia);
		setNumero(numero);
	}

	public abstract void deposita(double valor); /* Um método abstrsto, 
	não poder implementado na classe mãe, mas nas classes filhas.*/

	public boolean saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transfere(double valor, Conta destino) {

		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public void setAgencia(int agencia) {

		if (agencia <= 0) {

			System.out.println("A agência não pode ser <= 0, insira novamente.");
			return;
		} 
		this.agencia = agencia;
	}

	public int getAgencia() {

		return this.agencia;
	}

	public void setNumero(int numero) {

		if (numero <= 0) {

			System.out.println("O número não pode ser <= 0, insira novamente.");
			return;
		} 
			this.numero = numero;
	}

	public int getNumero() {

		return this.numero;
	}

	public double getSaldo() {

		return this.saldo;
	}

	public void setTitular(Cliente titular) {

		this.titular = titular;
	}

	public Cliente getTitular() {

		return this.titular;
	}

	public static int getTotal() {

		return Conta.total;
	}
}
