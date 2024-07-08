package bancoDigital;

public class Main {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.setNome("Danilo");
		
		Conta cc = new ContaCorrente(c);
		Conta pp = new ContaPoupanca(c);
		
		cc.depositar(500);
		cc.transferir(300, pp);
		
		cc.imprimirExtrato();
		pp.imprimirExtrato();
	}
}
