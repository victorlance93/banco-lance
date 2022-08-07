
public class Main {

	public static void main(String[] args) {
		Cliente victor = new Cliente();
		victor.setNome("Victor");
		
		Conta cc = new ContaCorrente(victor);
		cc.depositar(500);
		
		Conta cp = new ContaPoupanca(victor);
		cp.depositar(200);
		cp.sacar(10);
		
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		
 }

}
