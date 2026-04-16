
package sistemabancario;


public class ContaSalario extends ContaBancaria{

    public ContaSalario(int numero, double saldo, String titular) {
        super(numero, saldo, titular);
    }
    
    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado (sem taxa).");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Depósito não permitido em conta salário.");
    }
    
}
