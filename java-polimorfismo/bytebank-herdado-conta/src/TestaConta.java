
public class TestaConta {

	public static void main(String[] args) {
		
		Conta conta1 = new ContaCorrente(1337, 2569);
		
		Cliente tassia = new Cliente();
		
		conta1.setTitular(tassia);
		
		conta1.getTitular().setNome("Tassia Almeida Valadares");
		
		conta1.getTitular().setCpf("000.000.000-00");
		
		conta1.getTitular().setProfissao("Programadora");
		
		Conta conta2 = new ContaCorrente(1337,5694);
		
		Cliente giselia = new Cliente();
		
		conta2.setTitular(giselia);
		
		conta2.getTitular().setNome("Giselia Da Silva");
		
		conta2.getTitular().setCpf("000.000.000-00");
		
		conta2.getTitular().setProfissao("Engenheira");
		
		conta2.deposita(2000);
		
		conta2.transfere(500, conta1);
		
		System.out.println("Titular da conta 1: " + conta1.getTitular().getNome());
		
		System.out.println("Saldo da conta 1: " + conta1.getSaldo());
		
		System.out.println("Titular da conta 2: " + conta2.getTitular().getNome());
		
		System.out.println("Saldo da conta 2: " + conta2.getSaldo());
		
		
		
		
	}
}
