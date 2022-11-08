
public abstract interface  Autenticavel  {


	/*A interface é um contrato assinado pelas classes,
 	permitindo que o polimorfismo aconteça.*/
	
	/*A interface em um conceito geral,  possui todos os seus comportamentos 
 	abstratos, sendo implementados nas classes que assinaram o contrato.*/
	
	public abstract void setSenha(int senha);
		
	public abstract boolean autentica(int senha);
	
}
