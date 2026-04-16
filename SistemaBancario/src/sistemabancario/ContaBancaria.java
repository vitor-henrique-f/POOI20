
package sistemabancario;


public class ContaBancaria {
    
    private int numero;
    private double saldo;
    private String titular;

    public ContaBancaria(int numero, double saldo, String titular) {
        this.numero = numero;
        if (saldo >= 0) {
          this.saldo = saldo;
        } else {
          System.out.println("Saldo inválido");
        }
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado: " + valor);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado: " + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
          this.saldo = saldo;
        } else {
          System.out.println("Saldo inválido");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
}
