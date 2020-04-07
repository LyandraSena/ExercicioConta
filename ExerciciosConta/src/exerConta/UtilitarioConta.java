package exerConta;

public class UtilitarioConta {
	
    
		public void imprimirCont(Contas cont[]){
			
			for(int i=0; i < cont.length; i++) {
				if (cont[i] != null) {
						System.out.println("Numero da conta: " + cont[i].getNumero() + " / Saldo: " + cont[i].getSaldo());
				}
			}
		}
		
		public void somaSaldo (Contas cont[]) {
			float total = 0.0f;
			
			for(int i=0; i < cont.length; i++) {
				if (cont[i] != null) {
					total = total + cont[i].getSaldo();
				}
			}
			
			System.out.println("A soma dos saldos em todas as contas, gera o valor de: " + total); 
		
		}
	}

