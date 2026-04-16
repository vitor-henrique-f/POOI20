
package sistemabancario;

public class ContaPoupança extends ContaBancaria{

    public ContaPoupança(int numero, double saldo, String titular) {
        super(numero, saldo, titular);
    }

    @Override
    public void consultarSaldo() {
        double rendimento = getSaldo() * 0.01; // 1%
        setSaldo(getSaldo() + rendimento);
        System.out.println("Saldo com rendimento: " + getSaldo());
    }
    
}
