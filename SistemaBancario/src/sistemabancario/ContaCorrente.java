
package sistemabancario;


public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(int numero, double saldo, String titular) {
        super(numero, saldo, titular);
    }   
    
    @Override
    public void sacar(double valor) {
        double taxa = 2.0; // taxa fixa
        double total = valor + taxa;

        if (total <= getSaldo()) {
            setSaldo(getSaldo() - total);
            System.out.println("Saque com taxa realizado: " + total);
        } else {
            System.out.println("Saldo insuficiente (com taxa).");
        }
    }
}
