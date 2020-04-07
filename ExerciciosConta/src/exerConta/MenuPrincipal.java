package exerConta;

public class MenuPrincipal {
	public static void main (String[] args) {
		
		Contas cont[] = new Contas[10];
		
		cont[0] = new Contas(123, 1000, 2);
	    cont[1] = new Contas(456, 800, 1);
	    
	    
	   UtilitarioConta uc = new UtilitarioConta();
	   
	   uc.imprimirCont(cont);
	   uc.somaSaldo(cont);
	
	}
}