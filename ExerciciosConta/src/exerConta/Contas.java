package exerConta;

public class Contas{
	private int numero;
	private float saldo;
    private int tipo; 
 
  public Contas (int numeroDaConta, int saldoInicial, int tipoInicial ){
    numero = (numeroDaConta);
    saldo = saldoInicial;
  }
  

  public void debitar (float valor){
  	saldo = saldo - valor; 
  }
  
  public void creditar(float valor){
    saldo = saldo + valor;
  }
  
  
  public void setSaldo(float novoSaldo){
   saldo = novoSaldo;
    
  }

public int getTipo() {
	return tipo;
}


public int getNumero() {
	return numero;
}


public void setNumero(int numero) {
	this.numero = numero;
}


public float getSaldo() {
	return saldo;
}
} 

