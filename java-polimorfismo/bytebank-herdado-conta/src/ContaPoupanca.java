
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) { /*Um construtor não
	pode ser herdado pela classe filha, invocadp através do super(). */
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		
		super.saldo += valor;
	}
}
