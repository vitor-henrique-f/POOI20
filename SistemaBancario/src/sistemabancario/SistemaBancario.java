
package sistemabancario;

public class SistemaBancario {

    
    public static void main(String[] args) {

       Cliente c1 = new Cliente("João", "123.456.789-00");

        ContaBancaria conta1 = new ContaCorrente(1, 1000, "c1");
        ContaBancaria conta2 = new ContaPoupança(2, 1000, "c1");
        ContaBancaria conta3 = new ContaSalario(3, 1000, "c1");

        conta1.sacar(100);
        conta1.consultarSaldo();

        conta2.consultarSaldo();

        conta3.depositar(200);
        conta3.sacar(100);
        conta3.consultarSaldo();
    }
        
    }
